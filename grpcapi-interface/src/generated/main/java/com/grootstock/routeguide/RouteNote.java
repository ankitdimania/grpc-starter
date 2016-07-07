// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide.proto

package com.grootstock.routeguide;

/**
 * <pre>
 * A RouteNote is a message sent while at a given point.
 * </pre>
 *
 * Protobuf type {@code routeguide.RouteNote}
 */
public  final class RouteNote extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:routeguide.RouteNote)
    RouteNoteOrBuilder {
  // Use RouteNote.newBuilder() to construct.
  private RouteNote(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private RouteNote() {
    message_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RouteNote(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.grootstock.routeguide.Point.Builder subBuilder = null;
            if (location_ != null) {
              subBuilder = location_.toBuilder();
            }
            location_ = input.readMessage(com.grootstock.routeguide.Point.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(location_);
              location_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grootstock.routeguide.RouteGuideProto.internal_static_routeguide_RouteNote_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grootstock.routeguide.RouteGuideProto.internal_static_routeguide_RouteNote_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grootstock.routeguide.RouteNote.class, com.grootstock.routeguide.RouteNote.Builder.class);
  }

  public static final int LOCATION_FIELD_NUMBER = 1;
  private com.grootstock.routeguide.Point location_;
  /**
   * <pre>
   * The location from which the message is sent.
   * </pre>
   *
   * <code>optional .routeguide.Point location = 1;</code>
   */
  public boolean hasLocation() {
    return location_ != null;
  }
  /**
   * <pre>
   * The location from which the message is sent.
   * </pre>
   *
   * <code>optional .routeguide.Point location = 1;</code>
   */
  public com.grootstock.routeguide.Point getLocation() {
    return location_ == null ? com.grootstock.routeguide.Point.getDefaultInstance() : location_;
  }
  /**
   * <pre>
   * The location from which the message is sent.
   * </pre>
   *
   * <code>optional .routeguide.Point location = 1;</code>
   */
  public com.grootstock.routeguide.PointOrBuilder getLocationOrBuilder() {
    return getLocation();
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <pre>
   * The message to be sent.
   * </pre>
   *
   * <code>optional string message = 2;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The message to be sent.
   * </pre>
   *
   * <code>optional string message = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (location_ != null) {
      output.writeMessage(1, getLocation());
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, message_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (location_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLocation());
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, message_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.grootstock.routeguide.RouteNote parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grootstock.routeguide.RouteNote parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grootstock.routeguide.RouteNote parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grootstock.routeguide.RouteNote parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grootstock.routeguide.RouteNote parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.grootstock.routeguide.RouteNote parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grootstock.routeguide.RouteNote parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grootstock.routeguide.RouteNote parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grootstock.routeguide.RouteNote parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.grootstock.routeguide.RouteNote parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.grootstock.routeguide.RouteNote prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A RouteNote is a message sent while at a given point.
   * </pre>
   *
   * Protobuf type {@code routeguide.RouteNote}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:routeguide.RouteNote)
      com.grootstock.routeguide.RouteNoteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grootstock.routeguide.RouteGuideProto.internal_static_routeguide_RouteNote_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grootstock.routeguide.RouteGuideProto.internal_static_routeguide_RouteNote_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grootstock.routeguide.RouteNote.class, com.grootstock.routeguide.RouteNote.Builder.class);
    }

    // Construct using com.grootstock.routeguide.RouteNote.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (locationBuilder_ == null) {
        location_ = null;
      } else {
        location_ = null;
        locationBuilder_ = null;
      }
      message_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grootstock.routeguide.RouteGuideProto.internal_static_routeguide_RouteNote_descriptor;
    }

    public com.grootstock.routeguide.RouteNote getDefaultInstanceForType() {
      return com.grootstock.routeguide.RouteNote.getDefaultInstance();
    }

    public com.grootstock.routeguide.RouteNote build() {
      com.grootstock.routeguide.RouteNote result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.grootstock.routeguide.RouteNote buildPartial() {
      com.grootstock.routeguide.RouteNote result = new com.grootstock.routeguide.RouteNote(this);
      if (locationBuilder_ == null) {
        result.location_ = location_;
      } else {
        result.location_ = locationBuilder_.build();
      }
      result.message_ = message_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.grootstock.routeguide.RouteNote) {
        return mergeFrom((com.grootstock.routeguide.RouteNote)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grootstock.routeguide.RouteNote other) {
      if (other == com.grootstock.routeguide.RouteNote.getDefaultInstance()) return this;
      if (other.hasLocation()) {
        mergeLocation(other.getLocation());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.grootstock.routeguide.RouteNote parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grootstock.routeguide.RouteNote) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.grootstock.routeguide.Point location_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.grootstock.routeguide.Point, com.grootstock.routeguide.Point.Builder, com.grootstock.routeguide.PointOrBuilder> locationBuilder_;
    /**
     * <pre>
     * The location from which the message is sent.
     * </pre>
     *
     * <code>optional .routeguide.Point location = 1;</code>
     */
    public boolean hasLocation() {
      return locationBuilder_ != null || location_ != null;
    }
    /**
     * <pre>
     * The location from which the message is sent.
     * </pre>
     *
     * <code>optional .routeguide.Point location = 1;</code>
     */
    public com.grootstock.routeguide.Point getLocation() {
      if (locationBuilder_ == null) {
        return location_ == null ? com.grootstock.routeguide.Point.getDefaultInstance() : location_;
      } else {
        return locationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The location from which the message is sent.
     * </pre>
     *
     * <code>optional .routeguide.Point location = 1;</code>
     */
    public Builder setLocation(com.grootstock.routeguide.Point value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        location_ = value;
        onChanged();
      } else {
        locationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The location from which the message is sent.
     * </pre>
     *
     * <code>optional .routeguide.Point location = 1;</code>
     */
    public Builder setLocation(
        com.grootstock.routeguide.Point.Builder builderForValue) {
      if (locationBuilder_ == null) {
        location_ = builderForValue.build();
        onChanged();
      } else {
        locationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The location from which the message is sent.
     * </pre>
     *
     * <code>optional .routeguide.Point location = 1;</code>
     */
    public Builder mergeLocation(com.grootstock.routeguide.Point value) {
      if (locationBuilder_ == null) {
        if (location_ != null) {
          location_ =
            com.grootstock.routeguide.Point.newBuilder(location_).mergeFrom(value).buildPartial();
        } else {
          location_ = value;
        }
        onChanged();
      } else {
        locationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The location from which the message is sent.
     * </pre>
     *
     * <code>optional .routeguide.Point location = 1;</code>
     */
    public Builder clearLocation() {
      if (locationBuilder_ == null) {
        location_ = null;
        onChanged();
      } else {
        location_ = null;
        locationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The location from which the message is sent.
     * </pre>
     *
     * <code>optional .routeguide.Point location = 1;</code>
     */
    public com.grootstock.routeguide.Point.Builder getLocationBuilder() {
      
      onChanged();
      return getLocationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The location from which the message is sent.
     * </pre>
     *
     * <code>optional .routeguide.Point location = 1;</code>
     */
    public com.grootstock.routeguide.PointOrBuilder getLocationOrBuilder() {
      if (locationBuilder_ != null) {
        return locationBuilder_.getMessageOrBuilder();
      } else {
        return location_ == null ?
            com.grootstock.routeguide.Point.getDefaultInstance() : location_;
      }
    }
    /**
     * <pre>
     * The location from which the message is sent.
     * </pre>
     *
     * <code>optional .routeguide.Point location = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.grootstock.routeguide.Point, com.grootstock.routeguide.Point.Builder, com.grootstock.routeguide.PointOrBuilder> 
        getLocationFieldBuilder() {
      if (locationBuilder_ == null) {
        locationBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.grootstock.routeguide.Point, com.grootstock.routeguide.Point.Builder, com.grootstock.routeguide.PointOrBuilder>(
                getLocation(),
                getParentForChildren(),
                isClean());
        location_ = null;
      }
      return locationBuilder_;
    }

    private java.lang.Object message_ = "";
    /**
     * <pre>
     * The message to be sent.
     * </pre>
     *
     * <code>optional string message = 2;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The message to be sent.
     * </pre>
     *
     * <code>optional string message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The message to be sent.
     * </pre>
     *
     * <code>optional string message = 2;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The message to be sent.
     * </pre>
     *
     * <code>optional string message = 2;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The message to be sent.
     * </pre>
     *
     * <code>optional string message = 2;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:routeguide.RouteNote)
  }

  // @@protoc_insertion_point(class_scope:routeguide.RouteNote)
  private static final com.grootstock.routeguide.RouteNote DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grootstock.routeguide.RouteNote();
  }

  public static com.grootstock.routeguide.RouteNote getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RouteNote>
      PARSER = new com.google.protobuf.AbstractParser<RouteNote>() {
    public RouteNote parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RouteNote(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RouteNote> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RouteNote> getParserForType() {
    return PARSER;
  }

  public com.grootstock.routeguide.RouteNote getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

