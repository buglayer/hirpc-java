// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ResponsePb.proto

package com.hirpc.protocol.protobuf;

public final class ResponsePb {
  private ResponsePb() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ResponseInnerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.hirpc.entity.ResponseInner)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string error = 1;</code>
     * @return Whether the error field is set.
     */
    boolean hasError();
    /**
     * <code>optional string error = 1;</code>
     * @return The error.
     */
    String getError();
    /**
     * <code>optional string error = 1;</code>
     * @return The bytes for error.
     */
    com.google.protobuf.ByteString
        getErrorBytes();

    /**
     * <code>required string returnType = 2;</code>
     * @return Whether the returnType field is set.
     */
    boolean hasReturnType();
    /**
     * <code>required string returnType = 2;</code>
     * @return The returnType.
     */
    String getReturnType();
    /**
     * <code>required string returnType = 2;</code>
     * @return The bytes for returnType.
     */
    com.google.protobuf.ByteString
        getReturnTypeBytes();
  }
  /**
   * Protobuf type {@code com.hirpc.entity.ResponseInner}
   */
  public  static final class ResponseInner extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.hirpc.entity.ResponseInner)
      ResponseInnerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ResponseInner.newBuilder() to construct.
    private ResponseInner(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResponseInner() {
      error_ = "";
      returnType_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new ResponseInner();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ResponseInner(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              error_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              returnType_ = bs;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ResponsePb.internal_static_com_hirpc_entity_ResponseInner_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ResponsePb.internal_static_com_hirpc_entity_ResponseInner_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ResponseInner.class, Builder.class);
    }

    private int bitField0_;
    public static final int ERROR_FIELD_NUMBER = 1;
    private volatile Object error_;
    /**
     * <code>optional string error = 1;</code>
     * @return Whether the error field is set.
     */
    public boolean hasError() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string error = 1;</code>
     * @return The error.
     */
    public String getError() {
      Object ref = error_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          error_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string error = 1;</code>
     * @return The bytes for error.
     */
    public com.google.protobuf.ByteString
        getErrorBytes() {
      Object ref = error_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        error_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RETURNTYPE_FIELD_NUMBER = 2;
    private volatile Object returnType_;
    /**
     * <code>required string returnType = 2;</code>
     * @return Whether the returnType field is set.
     */
    public boolean hasReturnType() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required string returnType = 2;</code>
     * @return The returnType.
     */
    public String getReturnType() {
      Object ref = returnType_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          returnType_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string returnType = 2;</code>
     * @return The bytes for returnType.
     */
    public com.google.protobuf.ByteString
        getReturnTypeBytes() {
      Object ref = returnType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        returnType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasReturnType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, error_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, returnType_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, error_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, returnType_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ResponseInner)) {
        return super.equals(obj);
      }
      ResponseInner other = (ResponseInner) obj;

      if (hasError() != other.hasError()) return false;
      if (hasError()) {
        if (!getError()
            .equals(other.getError())) return false;
      }
      if (hasReturnType() != other.hasReturnType()) return false;
      if (hasReturnType()) {
        if (!getReturnType()
            .equals(other.getReturnType())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasError()) {
        hash = (37 * hash) + ERROR_FIELD_NUMBER;
        hash = (53 * hash) + getError().hashCode();
      }
      if (hasReturnType()) {
        hash = (37 * hash) + RETURNTYPE_FIELD_NUMBER;
        hash = (53 * hash) + getReturnType().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ResponseInner parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseInner parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseInner parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseInner parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseInner parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResponseInner parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResponseInner parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseInner parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseInner parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ResponseInner parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResponseInner parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResponseInner parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ResponseInner prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.hirpc.entity.ResponseInner}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.hirpc.entity.ResponseInner)
        ResponseInnerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ResponsePb.internal_static_com_hirpc_entity_ResponseInner_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ResponsePb.internal_static_com_hirpc_entity_ResponseInner_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ResponseInner.class, Builder.class);
      }

      // Construct using com.hirpc.protocol.protobuf.ResponsePb.ResponseInner.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        error_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        returnType_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ResponsePb.internal_static_com_hirpc_entity_ResponseInner_descriptor;
      }

      @Override
      public ResponseInner getDefaultInstanceForType() {
        return ResponseInner.getDefaultInstance();
      }

      @Override
      public ResponseInner build() {
        ResponseInner result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ResponseInner buildPartial() {
        ResponseInner result = new ResponseInner(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.error_ = error_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.returnType_ = returnType_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ResponseInner) {
          return mergeFrom((ResponseInner)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ResponseInner other) {
        if (other == ResponseInner.getDefaultInstance()) return this;
        if (other.hasError()) {
          bitField0_ |= 0x00000001;
          error_ = other.error_;
          onChanged();
        }
        if (other.hasReturnType()) {
          bitField0_ |= 0x00000002;
          returnType_ = other.returnType_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        if (!hasReturnType()) {
          return false;
        }
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ResponseInner parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ResponseInner) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private Object error_ = "";
      /**
       * <code>optional string error = 1;</code>
       * @return Whether the error field is set.
       */
      public boolean hasError() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string error = 1;</code>
       * @return The error.
       */
      public String getError() {
        Object ref = error_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            error_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string error = 1;</code>
       * @return The bytes for error.
       */
      public com.google.protobuf.ByteString
          getErrorBytes() {
        Object ref = error_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          error_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string error = 1;</code>
       * @param value The error to set.
       * @return This builder for chaining.
       */
      public Builder setError(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        error_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string error = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearError() {
        bitField0_ = (bitField0_ & ~0x00000001);
        error_ = getDefaultInstance().getError();
        onChanged();
        return this;
      }
      /**
       * <code>optional string error = 1;</code>
       * @param value The bytes for error to set.
       * @return This builder for chaining.
       */
      public Builder setErrorBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        error_ = value;
        onChanged();
        return this;
      }

      private Object returnType_ = "";
      /**
       * <code>required string returnType = 2;</code>
       * @return Whether the returnType field is set.
       */
      public boolean hasReturnType() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required string returnType = 2;</code>
       * @return The returnType.
       */
      public String getReturnType() {
        Object ref = returnType_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            returnType_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string returnType = 2;</code>
       * @return The bytes for returnType.
       */
      public com.google.protobuf.ByteString
          getReturnTypeBytes() {
        Object ref = returnType_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          returnType_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string returnType = 2;</code>
       * @param value The returnType to set.
       * @return This builder for chaining.
       */
      public Builder setReturnType(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        returnType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string returnType = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearReturnType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        returnType_ = getDefaultInstance().getReturnType();
        onChanged();
        return this;
      }
      /**
       * <code>required string returnType = 2;</code>
       * @param value The bytes for returnType to set.
       * @return This builder for chaining.
       */
      public Builder setReturnTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        returnType_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.hirpc.entity.ResponseInner)
    }

    // @@protoc_insertion_point(class_scope:com.hirpc.entity.ResponseInner)
    private static final ResponseInner DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ResponseInner();
    }

    public static ResponseInner getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @Deprecated public static final com.google.protobuf.Parser<ResponseInner>
        PARSER = new com.google.protobuf.AbstractParser<ResponseInner>() {
      @Override
      public ResponseInner parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResponseInner(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ResponseInner> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ResponseInner> getParserForType() {
      return PARSER;
    }

    @Override
    public ResponseInner getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hirpc_entity_ResponseInner_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_hirpc_entity_ResponseInner_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\020ResponsePb.proto\022\020com.hirpc.entity\"2\n\r" +
      "ResponseInner\022\r\n\005error\030\001 \001(\t\022\022\n\nreturnTy" +
      "pe\030\002 \002(\tB)\n\033com.hirpc.protocol.protobufB" +
      "\nResponsePb"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_hirpc_entity_ResponseInner_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_hirpc_entity_ResponseInner_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_hirpc_entity_ResponseInner_descriptor,
        new String[] { "Error", "ReturnType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}