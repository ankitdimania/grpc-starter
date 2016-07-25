package com.grootstock.config;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import static org.apache.commons.io.IOUtils.toByteArray;

/**
 * list resources available from the classpath @ *.
 */
public class AppConfigFiles {

  /**
   * for all elements of java.class.path, get a Collection of resources
   * of Pattern "*.yaml".
   *
   * @return the resources in the order they are found
   * @throws IOException if file io failed
   */
  public static List<InputStream> getResources() throws IOException {
    Pattern pattern = Pattern.compile(".*appconfig/[^/]*\\.yaml");
    return getResources(pattern);
  }

  /**
   * for all elements of java.class.path get a Collection of resources Pattern
   * {@code pattern} gets all resources
   *
   * @param pattern the pattern to match
   * @return the resources in the order they are found
   * @throws IOException if file io failed
   */
  public static List<InputStream> getResources(final Pattern pattern) throws IOException {
    final ArrayList<InputStream> retval = new ArrayList<>();
    final String classPath = System.getProperty("java.class.path", ".");
    final String[] classPathElements = classPath.split(System.getProperty("path.separator"));
    for (final String element : classPathElements) {
      retval.addAll(getResources(element, pattern));
    }
    retval.addAll(getResources("./config", pattern));
    return retval;
  }

  private static List<InputStream> getResources(
          final String element,
          final Pattern pattern) throws IOException {
    final ArrayList<InputStream> retval = new ArrayList<>();
    final File file = new File(element);
    if (file.isDirectory()) {
      retval.addAll(getResourcesFromDirectory(file, pattern));
    } else {
      retval.addAll(getResourcesFromJarFile(file, pattern));
    }
    return retval;
  }

  @SuppressWarnings("unchecked")
  private static ArrayList<InputStream> getResourcesFromJarFile(
          final File file,
          final Pattern pattern) throws IOException {
    final ArrayList<InputStream> retval = new ArrayList<>();
    try (ZipFile zf = new ZipFile(file)) {
      final Enumeration<ZipEntry> e = (Enumeration<ZipEntry>) zf.entries();
      while (e.hasMoreElements()) {
        final ZipEntry ze = e.nextElement();
        final String fileName = ze.getName();
        if (pattern.matcher(fileName).matches()) {
          ByteArrayInputStream bis = new ByteArrayInputStream(toByteArray(zf.getInputStream(ze)));
          retval.add(bis);
        }
      }
    }
    return retval;
  }

  private static Collection<InputStream> getResourcesFromDirectory(
          final File directory,
          final Pattern pattern) {
    final ArrayList<InputStream> retval = new ArrayList<>();
    final File[] fileList = directory.listFiles();
    for (final File file : fileList) {
      if (file.isDirectory()) {
        retval.addAll(getResourcesFromDirectory(file, pattern));
      } else {
        try {
          final String fileName = file.getCanonicalPath();
          if (pattern.matcher(fileName).matches()) {
            retval.add(new FileInputStream(file));
          }
        } catch (final IOException e) {
          throw new Error(e);
        }
      }
    }
    return retval;
  }
}
