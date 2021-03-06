// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: math.proto

package com.grootstock.math;

/**
 * <pre>
 * The request message for multiply.
 * </pre>
 *
 * Protobuf type {@code math.MultiplyRequest}
 */
public  final class MultiplyRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:math.MultiplyRequest)
    MultiplyRequestOrBuilder {
  // Use MultiplyRequest.newBuilder() to construct.
  private MultiplyRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private MultiplyRequest() {
    a_ = 0D;
    b_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MultiplyRequest(
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
          case 9: {

            a_ = input.readDouble();
            break;
          }
          case 17: {

            b_ = input.readDouble();
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
    return com.grootstock.math.MathProto.internal_static_math_MultiplyRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grootstock.math.MathProto.internal_static_math_MultiplyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grootstock.math.MultiplyRequest.class, com.grootstock.math.MultiplyRequest.Builder.class);
  }

  public static final int A_FIELD_NUMBER = 1;
  private double a_;
  /**
   * <code>optional double a = 1;</code>
   */
  public double getA() {
    return a_;
  }

  public static final int B_FIELD_NUMBER = 2;
  private double b_;
  /**
   * <code>optional double b = 2;</code>
   */
  public double getB() {
    return b_;
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
    if (a_ != 0D) {
      output.writeDouble(1, a_);
    }
    if (b_ != 0D) {
      output.writeDouble(2, b_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (a_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, a_);
    }
    if (b_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, b_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.grootstock.math.MultiplyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grootstock.math.MultiplyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grootstock.math.MultiplyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grootstock.math.MultiplyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grootstock.math.MultiplyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.grootstock.math.MultiplyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grootstock.math.MultiplyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grootstock.math.MultiplyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grootstock.math.MultiplyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.grootstock.math.MultiplyRequest parseFrom(
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
  public static Builder newBuilder(com.grootstock.math.MultiplyRequest prototype) {
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
   * The request message for multiply.
   * </pre>
   *
   * Protobuf type {@code math.MultiplyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:math.MultiplyRequest)
      com.grootstock.math.MultiplyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grootstock.math.MathProto.internal_static_math_MultiplyRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grootstock.math.MathProto.internal_static_math_MultiplyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grootstock.math.MultiplyRequest.class, com.grootstock.math.MultiplyRequest.Builder.class);
    }

    // Construct using com.grootstock.math.MultiplyRequest.newBuilder()
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
      a_ = 0D;

      b_ = 0D;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grootstock.math.MathProto.internal_static_math_MultiplyRequest_descriptor;
    }

    public com.grootstock.math.MultiplyRequest getDefaultInstanceForType() {
      return com.grootstock.math.MultiplyRequest.getDefaultInstance();
    }

    public com.grootstock.math.MultiplyRequest build() {
      com.grootstock.math.MultiplyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.grootstock.math.MultiplyRequest buildPartial() {
      com.grootstock.math.MultiplyRequest result = new com.grootstock.math.MultiplyRequest(this);
      result.a_ = a_;
      result.b_ = b_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.grootstock.math.MultiplyRequest) {
        return mergeFrom((com.grootstock.math.MultiplyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grootstock.math.MultiplyRequest other) {
      if (other == com.grootstock.math.MultiplyRequest.getDefaultInstance()) return this;
      if (other.getA() != 0D) {
        setA(other.getA());
      }
      if (other.getB() != 0D) {
        setB(other.getB());
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
      com.grootstock.math.MultiplyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grootstock.math.MultiplyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double a_ ;
    /**
     * <code>optional double a = 1;</code>
     */
    public double getA() {
      return a_;
    }
    /**
     * <code>optional double a = 1;</code>
     */
    public Builder setA(double value) {
      
      a_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional double a = 1;</code>
     */
    public Builder clearA() {
      
      a_ = 0D;
      onChanged();
      return this;
    }

    private double b_ ;
    /**
     * <code>optional double b = 2;</code>
     */
    public double getB() {
      return b_;
    }
    /**
     * <code>optional double b = 2;</code>
     */
    public Builder setB(double value) {
      
      b_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional double b = 2;</code>
     */
    public Builder clearB() {
      
      b_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:math.MultiplyRequest)
  }

  // @@protoc_insertion_point(class_scope:math.MultiplyRequest)
  private static final com.grootstock.math.MultiplyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grootstock.math.MultiplyRequest();
  }

  public static com.grootstock.math.MultiplyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiplyRequest>
      PARSER = new com.google.protobuf.AbstractParser<MultiplyRequest>() {
    public MultiplyRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new MultiplyRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MultiplyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiplyRequest> getParserForType() {
    return PARSER;
  }

  public com.grootstock.math.MultiplyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

