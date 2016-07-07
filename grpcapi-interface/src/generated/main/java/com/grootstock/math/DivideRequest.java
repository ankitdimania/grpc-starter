// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: math.proto

package com.grootstock.math;

/**
 * <pre>
 * The request message for divide.
 * </pre>
 *
 * Protobuf type {@code math.DivideRequest}
 */
public  final class DivideRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:math.DivideRequest)
    DivideRequestOrBuilder {
  // Use DivideRequest.newBuilder() to construct.
  private DivideRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private DivideRequest() {
    dividend_ = 0L;
    divisor_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DivideRequest(
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
          case 8: {

            dividend_ = input.readInt64();
            break;
          }
          case 16: {

            divisor_ = input.readInt64();
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
    return com.grootstock.math.MathProto.internal_static_math_DivideRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grootstock.math.MathProto.internal_static_math_DivideRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grootstock.math.DivideRequest.class, com.grootstock.math.DivideRequest.Builder.class);
  }

  public static final int DIVIDEND_FIELD_NUMBER = 1;
  private long dividend_;
  /**
   * <code>optional int64 dividend = 1;</code>
   */
  public long getDividend() {
    return dividend_;
  }

  public static final int DIVISOR_FIELD_NUMBER = 2;
  private long divisor_;
  /**
   * <code>optional int64 divisor = 2;</code>
   */
  public long getDivisor() {
    return divisor_;
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
    if (dividend_ != 0L) {
      output.writeInt64(1, dividend_);
    }
    if (divisor_ != 0L) {
      output.writeInt64(2, divisor_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dividend_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, dividend_);
    }
    if (divisor_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, divisor_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.grootstock.math.DivideRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grootstock.math.DivideRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grootstock.math.DivideRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grootstock.math.DivideRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grootstock.math.DivideRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.grootstock.math.DivideRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grootstock.math.DivideRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grootstock.math.DivideRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grootstock.math.DivideRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.grootstock.math.DivideRequest parseFrom(
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
  public static Builder newBuilder(com.grootstock.math.DivideRequest prototype) {
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
   * The request message for divide.
   * </pre>
   *
   * Protobuf type {@code math.DivideRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:math.DivideRequest)
      com.grootstock.math.DivideRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grootstock.math.MathProto.internal_static_math_DivideRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grootstock.math.MathProto.internal_static_math_DivideRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grootstock.math.DivideRequest.class, com.grootstock.math.DivideRequest.Builder.class);
    }

    // Construct using com.grootstock.math.DivideRequest.newBuilder()
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
      dividend_ = 0L;

      divisor_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grootstock.math.MathProto.internal_static_math_DivideRequest_descriptor;
    }

    public com.grootstock.math.DivideRequest getDefaultInstanceForType() {
      return com.grootstock.math.DivideRequest.getDefaultInstance();
    }

    public com.grootstock.math.DivideRequest build() {
      com.grootstock.math.DivideRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.grootstock.math.DivideRequest buildPartial() {
      com.grootstock.math.DivideRequest result = new com.grootstock.math.DivideRequest(this);
      result.dividend_ = dividend_;
      result.divisor_ = divisor_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.grootstock.math.DivideRequest) {
        return mergeFrom((com.grootstock.math.DivideRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grootstock.math.DivideRequest other) {
      if (other == com.grootstock.math.DivideRequest.getDefaultInstance()) return this;
      if (other.getDividend() != 0L) {
        setDividend(other.getDividend());
      }
      if (other.getDivisor() != 0L) {
        setDivisor(other.getDivisor());
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
      com.grootstock.math.DivideRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grootstock.math.DivideRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long dividend_ ;
    /**
     * <code>optional int64 dividend = 1;</code>
     */
    public long getDividend() {
      return dividend_;
    }
    /**
     * <code>optional int64 dividend = 1;</code>
     */
    public Builder setDividend(long value) {
      
      dividend_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 dividend = 1;</code>
     */
    public Builder clearDividend() {
      
      dividend_ = 0L;
      onChanged();
      return this;
    }

    private long divisor_ ;
    /**
     * <code>optional int64 divisor = 2;</code>
     */
    public long getDivisor() {
      return divisor_;
    }
    /**
     * <code>optional int64 divisor = 2;</code>
     */
    public Builder setDivisor(long value) {
      
      divisor_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 divisor = 2;</code>
     */
    public Builder clearDivisor() {
      
      divisor_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:math.DivideRequest)
  }

  // @@protoc_insertion_point(class_scope:math.DivideRequest)
  private static final com.grootstock.math.DivideRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grootstock.math.DivideRequest();
  }

  public static com.grootstock.math.DivideRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DivideRequest>
      PARSER = new com.google.protobuf.AbstractParser<DivideRequest>() {
    public DivideRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DivideRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DivideRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DivideRequest> getParserForType() {
    return PARSER;
  }

  public com.grootstock.math.DivideRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

