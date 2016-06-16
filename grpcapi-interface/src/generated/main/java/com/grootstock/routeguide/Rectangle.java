// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide.proto

package com.grootstock.routeguide;

/**
 * Protobuf type {@code routeguide.Rectangle}
 *
 * <pre>
 * A latitude-longitude rectangle, represented as two diagonally opposite
 * points "lo" and "hi".
 * </pre>
 */
public  final class Rectangle extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:routeguide.Rectangle)
    RectangleOrBuilder {
  // Use Rectangle.newBuilder() to construct.
  private Rectangle(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Rectangle() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Rectangle(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
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
            if (lo_ != null) {
              subBuilder = lo_.toBuilder();
            }
            lo_ = input.readMessage(com.grootstock.routeguide.Point.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lo_);
              lo_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.grootstock.routeguide.Point.Builder subBuilder = null;
            if (hi_ != null) {
              subBuilder = hi_.toBuilder();
            }
            hi_ = input.readMessage(com.grootstock.routeguide.Point.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(hi_);
              hi_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grootstock.routeguide.RouteGuideProto.internal_static_routeguide_Rectangle_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grootstock.routeguide.RouteGuideProto.internal_static_routeguide_Rectangle_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grootstock.routeguide.Rectangle.class, com.grootstock.routeguide.Rectangle.Builder.class);
  }

  public static final int LO_FIELD_NUMBER = 1;
  private com.grootstock.routeguide.Point lo_;
  /**
   * <code>optional .routeguide.Point lo = 1;</code>
   *
   * <pre>
   * One corner of the rectangle.
   * </pre>
   */
  public boolean hasLo() {
    return lo_ != null;
  }
  /**
   * <code>optional .routeguide.Point lo = 1;</code>
   *
   * <pre>
   * One corner of the rectangle.
   * </pre>
   */
  public com.grootstock.routeguide.Point getLo() {
    return lo_ == null ? com.grootstock.routeguide.Point.getDefaultInstance() : lo_;
  }
  /**
   * <code>optional .routeguide.Point lo = 1;</code>
   *
   * <pre>
   * One corner of the rectangle.
   * </pre>
   */
  public com.grootstock.routeguide.PointOrBuilder getLoOrBuilder() {
    return getLo();
  }

  public static final int HI_FIELD_NUMBER = 2;
  private com.grootstock.routeguide.Point hi_;
  /**
   * <code>optional .routeguide.Point hi = 2;</code>
   *
   * <pre>
   * The other corner of the rectangle.
   * </pre>
   */
  public boolean hasHi() {
    return hi_ != null;
  }
  /**
   * <code>optional .routeguide.Point hi = 2;</code>
   *
   * <pre>
   * The other corner of the rectangle.
   * </pre>
   */
  public com.grootstock.routeguide.Point getHi() {
    return hi_ == null ? com.grootstock.routeguide.Point.getDefaultInstance() : hi_;
  }
  /**
   * <code>optional .routeguide.Point hi = 2;</code>
   *
   * <pre>
   * The other corner of the rectangle.
   * </pre>
   */
  public com.grootstock.routeguide.PointOrBuilder getHiOrBuilder() {
    return getHi();
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
    if (lo_ != null) {
      output.writeMessage(1, getLo());
    }
    if (hi_ != null) {
      output.writeMessage(2, getHi());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLo());
    }
    if (hi_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getHi());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.grootstock.routeguide.Rectangle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grootstock.routeguide.Rectangle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grootstock.routeguide.Rectangle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grootstock.routeguide.Rectangle parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grootstock.routeguide.Rectangle parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.grootstock.routeguide.Rectangle parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.grootstock.routeguide.Rectangle parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.grootstock.routeguide.Rectangle parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.grootstock.routeguide.Rectangle parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.grootstock.routeguide.Rectangle parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.grootstock.routeguide.Rectangle prototype) {
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
   * Protobuf type {@code routeguide.Rectangle}
   *
   * <pre>
   * A latitude-longitude rectangle, represented as two diagonally opposite
   * points "lo" and "hi".
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:routeguide.Rectangle)
      com.grootstock.routeguide.RectangleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grootstock.routeguide.RouteGuideProto.internal_static_routeguide_Rectangle_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grootstock.routeguide.RouteGuideProto.internal_static_routeguide_Rectangle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grootstock.routeguide.Rectangle.class, com.grootstock.routeguide.Rectangle.Builder.class);
    }

    // Construct using com.grootstock.routeguide.Rectangle.newBuilder()
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
      if (loBuilder_ == null) {
        lo_ = null;
      } else {
        lo_ = null;
        loBuilder_ = null;
      }
      if (hiBuilder_ == null) {
        hi_ = null;
      } else {
        hi_ = null;
        hiBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grootstock.routeguide.RouteGuideProto.internal_static_routeguide_Rectangle_descriptor;
    }

    public com.grootstock.routeguide.Rectangle getDefaultInstanceForType() {
      return com.grootstock.routeguide.Rectangle.getDefaultInstance();
    }

    public com.grootstock.routeguide.Rectangle build() {
      com.grootstock.routeguide.Rectangle result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.grootstock.routeguide.Rectangle buildPartial() {
      com.grootstock.routeguide.Rectangle result = new com.grootstock.routeguide.Rectangle(this);
      if (loBuilder_ == null) {
        result.lo_ = lo_;
      } else {
        result.lo_ = loBuilder_.build();
      }
      if (hiBuilder_ == null) {
        result.hi_ = hi_;
      } else {
        result.hi_ = hiBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.grootstock.routeguide.Rectangle) {
        return mergeFrom((com.grootstock.routeguide.Rectangle)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grootstock.routeguide.Rectangle other) {
      if (other == com.grootstock.routeguide.Rectangle.getDefaultInstance()) return this;
      if (other.hasLo()) {
        mergeLo(other.getLo());
      }
      if (other.hasHi()) {
        mergeHi(other.getHi());
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
      com.grootstock.routeguide.Rectangle parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grootstock.routeguide.Rectangle) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.grootstock.routeguide.Point lo_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.grootstock.routeguide.Point, com.grootstock.routeguide.Point.Builder, com.grootstock.routeguide.PointOrBuilder> loBuilder_;
    /**
     * <code>optional .routeguide.Point lo = 1;</code>
     *
     * <pre>
     * One corner of the rectangle.
     * </pre>
     */
    public boolean hasLo() {
      return loBuilder_ != null || lo_ != null;
    }
    /**
     * <code>optional .routeguide.Point lo = 1;</code>
     *
     * <pre>
     * One corner of the rectangle.
     * </pre>
     */
    public com.grootstock.routeguide.Point getLo() {
      if (loBuilder_ == null) {
        return lo_ == null ? com.grootstock.routeguide.Point.getDefaultInstance() : lo_;
      } else {
        return loBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .routeguide.Point lo = 1;</code>
     *
     * <pre>
     * One corner of the rectangle.
     * </pre>
     */
    public Builder setLo(com.grootstock.routeguide.Point value) {
      if (loBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lo_ = value;
        onChanged();
      } else {
        loBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .routeguide.Point lo = 1;</code>
     *
     * <pre>
     * One corner of the rectangle.
     * </pre>
     */
    public Builder setLo(
        com.grootstock.routeguide.Point.Builder builderForValue) {
      if (loBuilder_ == null) {
        lo_ = builderForValue.build();
        onChanged();
      } else {
        loBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .routeguide.Point lo = 1;</code>
     *
     * <pre>
     * One corner of the rectangle.
     * </pre>
     */
    public Builder mergeLo(com.grootstock.routeguide.Point value) {
      if (loBuilder_ == null) {
        if (lo_ != null) {
          lo_ =
            com.grootstock.routeguide.Point.newBuilder(lo_).mergeFrom(value).buildPartial();
        } else {
          lo_ = value;
        }
        onChanged();
      } else {
        loBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .routeguide.Point lo = 1;</code>
     *
     * <pre>
     * One corner of the rectangle.
     * </pre>
     */
    public Builder clearLo() {
      if (loBuilder_ == null) {
        lo_ = null;
        onChanged();
      } else {
        lo_ = null;
        loBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .routeguide.Point lo = 1;</code>
     *
     * <pre>
     * One corner of the rectangle.
     * </pre>
     */
    public com.grootstock.routeguide.Point.Builder getLoBuilder() {
      
      onChanged();
      return getLoFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .routeguide.Point lo = 1;</code>
     *
     * <pre>
     * One corner of the rectangle.
     * </pre>
     */
    public com.grootstock.routeguide.PointOrBuilder getLoOrBuilder() {
      if (loBuilder_ != null) {
        return loBuilder_.getMessageOrBuilder();
      } else {
        return lo_ == null ?
            com.grootstock.routeguide.Point.getDefaultInstance() : lo_;
      }
    }
    /**
     * <code>optional .routeguide.Point lo = 1;</code>
     *
     * <pre>
     * One corner of the rectangle.
     * </pre>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.grootstock.routeguide.Point, com.grootstock.routeguide.Point.Builder, com.grootstock.routeguide.PointOrBuilder> 
        getLoFieldBuilder() {
      if (loBuilder_ == null) {
        loBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.grootstock.routeguide.Point, com.grootstock.routeguide.Point.Builder, com.grootstock.routeguide.PointOrBuilder>(
                getLo(),
                getParentForChildren(),
                isClean());
        lo_ = null;
      }
      return loBuilder_;
    }

    private com.grootstock.routeguide.Point hi_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.grootstock.routeguide.Point, com.grootstock.routeguide.Point.Builder, com.grootstock.routeguide.PointOrBuilder> hiBuilder_;
    /**
     * <code>optional .routeguide.Point hi = 2;</code>
     *
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     */
    public boolean hasHi() {
      return hiBuilder_ != null || hi_ != null;
    }
    /**
     * <code>optional .routeguide.Point hi = 2;</code>
     *
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     */
    public com.grootstock.routeguide.Point getHi() {
      if (hiBuilder_ == null) {
        return hi_ == null ? com.grootstock.routeguide.Point.getDefaultInstance() : hi_;
      } else {
        return hiBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .routeguide.Point hi = 2;</code>
     *
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     */
    public Builder setHi(com.grootstock.routeguide.Point value) {
      if (hiBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hi_ = value;
        onChanged();
      } else {
        hiBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .routeguide.Point hi = 2;</code>
     *
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     */
    public Builder setHi(
        com.grootstock.routeguide.Point.Builder builderForValue) {
      if (hiBuilder_ == null) {
        hi_ = builderForValue.build();
        onChanged();
      } else {
        hiBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .routeguide.Point hi = 2;</code>
     *
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     */
    public Builder mergeHi(com.grootstock.routeguide.Point value) {
      if (hiBuilder_ == null) {
        if (hi_ != null) {
          hi_ =
            com.grootstock.routeguide.Point.newBuilder(hi_).mergeFrom(value).buildPartial();
        } else {
          hi_ = value;
        }
        onChanged();
      } else {
        hiBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .routeguide.Point hi = 2;</code>
     *
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     */
    public Builder clearHi() {
      if (hiBuilder_ == null) {
        hi_ = null;
        onChanged();
      } else {
        hi_ = null;
        hiBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .routeguide.Point hi = 2;</code>
     *
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     */
    public com.grootstock.routeguide.Point.Builder getHiBuilder() {
      
      onChanged();
      return getHiFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .routeguide.Point hi = 2;</code>
     *
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     */
    public com.grootstock.routeguide.PointOrBuilder getHiOrBuilder() {
      if (hiBuilder_ != null) {
        return hiBuilder_.getMessageOrBuilder();
      } else {
        return hi_ == null ?
            com.grootstock.routeguide.Point.getDefaultInstance() : hi_;
      }
    }
    /**
     * <code>optional .routeguide.Point hi = 2;</code>
     *
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.grootstock.routeguide.Point, com.grootstock.routeguide.Point.Builder, com.grootstock.routeguide.PointOrBuilder> 
        getHiFieldBuilder() {
      if (hiBuilder_ == null) {
        hiBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.grootstock.routeguide.Point, com.grootstock.routeguide.Point.Builder, com.grootstock.routeguide.PointOrBuilder>(
                getHi(),
                getParentForChildren(),
                isClean());
        hi_ = null;
      }
      return hiBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:routeguide.Rectangle)
  }

  // @@protoc_insertion_point(class_scope:routeguide.Rectangle)
  private static final com.grootstock.routeguide.Rectangle DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grootstock.routeguide.Rectangle();
  }

  public static com.grootstock.routeguide.Rectangle getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Rectangle>
      PARSER = new com.google.protobuf.AbstractParser<Rectangle>() {
    public Rectangle parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new Rectangle(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<Rectangle> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Rectangle> getParserForType() {
    return PARSER;
  }

  public com.grootstock.routeguide.Rectangle getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

