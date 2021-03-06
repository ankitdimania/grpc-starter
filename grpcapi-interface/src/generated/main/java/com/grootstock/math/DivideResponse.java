// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: math.proto

package com.grootstock.math;

/**
 * <pre>
 * The response message containing the division
 * </pre>
 *
 * Protobuf type {@code math.DivideResponse}
 */
public  final class DivideResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:math.DivideResponse)
    DivideResponseOrBuilder {
  // Use DivideResponse.newBuilder() to construct.
  private DivideResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private DivideResponse() {
    quotient_ = 0L;
    remainder_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DivideResponse(
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

            quotient_ = input.readInt64();
            break;
          }
          case 16: {

            remainder_ = input.readInt64();
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
    return com.grootstock.math.MathProto.internal_static_math_DivideResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grootstock.math.MathProto.internal_static_math_DivideResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grootstock.math.DivideResponse.class, com.grootstock.math.DivideResponse.Builder.class);
  }

  public static final int QUOTIENT_FIELD_NUMBER = 1;
  private long quotient_;
  /**
   * <code>optional int64 quotient = 1;</code>
   */
  public long getQuotient() {
    return quotient_;
  }

  public static final int REMAINDER_FIELD_NUMBER = 2;
  private long remainder_;
  /**
   * <code>optional int64 remainder = 2;</code>
   */
  public long getRemainder() {
    return remainder_;
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
    if (quotient_ != 0L) {
      output.writeInt64(1, quotient_);
    }
    if (remainder_ != 0L) {
      output.writeInt64(2, remainder_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (quotient_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, quotient_);
    }
    if (remainder_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, remainder_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.grootstock.math.DivideResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grootstock.math.DivideResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grootstock.math.DivideResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grootstock.math.DivideResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grootstock.math.DivideResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.grootstock.math.DivideResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grootstock.math.DivideResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grootstock.math.DivideResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grootstock.math.DivideResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.grootstock.math.DivideResponse parseFrom(
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
  public static Builder newBuilder(com.grootstock.math.DivideResponse prototype) {
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
   * The response message containing the division
   * </pre>
   *
   * Protobuf type {@code math.DivideResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:math.DivideResponse)
      com.grootstock.math.DivideResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grootstock.math.MathProto.internal_static_math_DivideResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grootstock.math.MathProto.internal_static_math_DivideResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grootstock.math.DivideResponse.class, com.grootstock.math.DivideResponse.Builder.class);
    }

    // Construct using com.grootstock.math.DivideResponse.newBuilder()
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
      quotient_ = 0L;

      remainder_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grootstock.math.MathProto.internal_static_math_DivideResponse_descriptor;
    }

    public com.grootstock.math.DivideResponse getDefaultInstanceForType() {
      return com.grootstock.math.DivideResponse.getDefaultInstance();
    }

    public com.grootstock.math.DivideResponse build() {
      com.grootstock.math.DivideResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.grootstock.math.DivideResponse buildPartial() {
      com.grootstock.math.DivideResponse result = new com.grootstock.math.DivideResponse(this);
      result.quotient_ = quotient_;
      result.remainder_ = remainder_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.grootstock.math.DivideResponse) {
        return mergeFrom((com.grootstock.math.DivideResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grootstock.math.DivideResponse other) {
      if (other == com.grootstock.math.DivideResponse.getDefaultInstance()) return this;
      if (other.getQuotient() != 0L) {
        setQuotient(other.getQuotient());
      }
      if (other.getRemainder() != 0L) {
        setRemainder(other.getRemainder());
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
      com.grootstock.math.DivideResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grootstock.math.DivideResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long quotient_ ;
    /**
     * <code>optional int64 quotient = 1;</code>
     */
    public long getQuotient() {
      return quotient_;
    }
    /**
     * <code>optional int64 quotient = 1;</code>
     */
    public Builder setQuotient(long value) {
      
      quotient_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 quotient = 1;</code>
     */
    public Builder clearQuotient() {
      
      quotient_ = 0L;
      onChanged();
      return this;
    }

    private long remainder_ ;
    /**
     * <code>optional int64 remainder = 2;</code>
     */
    public long getRemainder() {
      return remainder_;
    }
    /**
     * <code>optional int64 remainder = 2;</code>
     */
    public Builder setRemainder(long value) {
      
      remainder_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 remainder = 2;</code>
     */
    public Builder clearRemainder() {
      
      remainder_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:math.DivideResponse)
  }

  // @@protoc_insertion_point(class_scope:math.DivideResponse)
  private static final com.grootstock.math.DivideResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grootstock.math.DivideResponse();
  }

  public static com.grootstock.math.DivideResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DivideResponse>
      PARSER = new com.google.protobuf.AbstractParser<DivideResponse>() {
    public DivideResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DivideResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DivideResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DivideResponse> getParserForType() {
    return PARSER;
  }

  public com.grootstock.math.DivideResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

