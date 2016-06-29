package com.grootstock.logging;

import com.grootstock.ContextHolder;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.pattern.ConverterKeys;
import org.apache.logging.log4j.core.pattern.LogEventPatternConverter;
import org.apache.logging.log4j.core.pattern.PatternConverter;

@Plugin(name = "ReqIdConverter", category = PatternConverter.CATEGORY)
@ConverterKeys({"reqId"})
public class ReqIdConverter extends LogEventPatternConverter {
  private static final ReqIdConverter INSTANCE = new ReqIdConverter();

  protected ReqIdConverter() {
    super("reqId", "reqId");
  }

  public static ReqIdConverter newInstance(String[] options) {
    return INSTANCE;
  }

  @Override
  public void format(LogEvent event, StringBuilder toAppendTo) {
    toAppendTo.append(getReqId());
  }

  protected String getReqId() {
    ContextHolder contextHolder = ContextHolder.get();
    return contextHolder == null ? "" : contextHolder.getRequestId();
  }
}
