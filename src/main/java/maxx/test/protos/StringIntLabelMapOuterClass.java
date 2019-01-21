package maxx.test.protos;

public final class StringIntLabelMapOuterClass {
	private StringIntLabelMapOuterClass() {
	}

	public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
	}

	public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
		registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
	}

	public interface StringIntLabelMapItemOrBuilder extends
			// @@protoc_insertion_point(interface_extends:object_detection.protos.StringIntLabelMapItem)
			com.google.protobuf.MessageOrBuilder {

		/**
		 * <pre>
		 * String name. The most common practice is to set this to a MID or synsets
		 * id.
		 * </pre>
		 *
		 * <code>optional string name = 1;</code>
		 */
		boolean hasName();

		/**
		 * <pre>
		 * String name. The most common practice is to set this to a MID or synsets
		 * id.
		 * </pre>
		 *
		 * <code>optional string name = 1;</code>
		 */
		String getName();

		/**
		 * <pre>
		 * String name. The most common practice is to set this to a MID or synsets
		 * id.
		 * </pre>
		 *
		 * <code>optional string name = 1;</code>
		 */
		com.google.protobuf.ByteString getNameBytes();

		/**
		 * <pre>
		 * Integer id that maps to the string name above. Label ids should start from
		 * 1.
		 * </pre>
		 *
		 * <code>optional int32 id = 2;</code>
		 */
		boolean hasId();

		/**
		 * <pre>
		 * Integer id that maps to the string name above. Label ids should start from
		 * 1.
		 * </pre>
		 *
		 * <code>optional int32 id = 2;</code>
		 */
		int getId();

		/**
		 * <pre>
		 * Human readable string label.
		 * </pre>
		 *
		 * <code>optional string display_name = 3;</code>
		 */
		boolean hasDisplayName();

		/**
		 * <pre>
		 * Human readable string label.
		 * </pre>
		 *
		 * <code>optional string display_name = 3;</code>
		 */
		String getDisplayName();

		/**
		 * <pre>
		 * Human readable string label.
		 * </pre>
		 *
		 * <code>optional string display_name = 3;</code>
		 */
		com.google.protobuf.ByteString getDisplayNameBytes();
	}

	/**
	 * Protobuf type {@code object_detection.protos.StringIntLabelMapItem}
	 */
	public static final class StringIntLabelMapItem extends com.google.protobuf.GeneratedMessageV3 implements
			// @@protoc_insertion_point(message_implements:object_detection.protos.StringIntLabelMapItem)
			StringIntLabelMapItemOrBuilder {
		private static final long serialVersionUID = 0L;

		// Use StringIntLabelMapItem.newBuilder() to construct.
		private StringIntLabelMapItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
			super(builder);
		}

		private StringIntLabelMapItem() {
			name_ = "";
			id_ = 0;
			displayName_ = "";
		}

		@Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private StringIntLabelMapItem(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			this();
			if (extensionRegistry == null) {
				throw new NullPointerException();
			}
			int mutable_bitField0_ = 0;
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 10: {
						com.google.protobuf.ByteString bs = input.readBytes();
						bitField0_ |= 0x00000001;
						name_ = bs;
						break;
					}
					case 16: {
						bitField0_ |= 0x00000002;
						id_ = input.readInt32();
						break;
					}
					case 26: {
						com.google.protobuf.ByteString bs = input.readBytes();
						bitField0_ |= 0x00000004;
						displayName_ = bs;
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
			} finally {
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return internal_static_object_detection_protos_StringIntLabelMapItem_descriptor;
		}

		protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
			return internal_static_object_detection_protos_StringIntLabelMapItem_fieldAccessorTable
					.ensureFieldAccessorsInitialized(
							StringIntLabelMapItem.class,
							StringIntLabelMapItem.Builder.class);
		}

		private int bitField0_;
		public static final int NAME_FIELD_NUMBER = 1;
		private volatile Object name_;

		/**
		 * <pre>
		 * String name. The most common practice is to set this to a MID or synsets
		 * id.
		 * </pre>
		 *
		 * <code>optional string name = 1;</code>
		 */
		public boolean hasName() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		/**
		 * <pre>
		 * String name. The most common practice is to set this to a MID or synsets
		 * id.
		 * </pre>
		 *
		 * <code>optional string name = 1;</code>
		 */
		public String getName() {
			Object ref = name_;
			if (ref instanceof String) {
				return (String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				String s = bs.toStringUtf8();
				if (bs.isValidUtf8()) {
					name_ = s;
				}
				return s;
			}
		}

		/**
		 * <pre>
		 * String name. The most common practice is to set this to a MID or synsets
		 * id.
		 * </pre>
		 *
		 * <code>optional string name = 1;</code>
		 */
		public com.google.protobuf.ByteString getNameBytes() {
			Object ref = name_;
			if (ref instanceof String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
				name_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		public static final int ID_FIELD_NUMBER = 2;
		private int id_;

		/**
		 * <pre>
		 * Integer id that maps to the string name above. Label ids should start from
		 * 1.
		 * </pre>
		 *
		 * <code>optional int32 id = 2;</code>
		 */
		public boolean hasId() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		/**
		 * <pre>
		 * Integer id that maps to the string name above. Label ids should start from
		 * 1.
		 * </pre>
		 *
		 * <code>optional int32 id = 2;</code>
		 */
		public int getId() {
			return id_;
		}

		public static final int DISPLAY_NAME_FIELD_NUMBER = 3;
		private volatile Object displayName_;

		/**
		 * <pre>
		 * Human readable string label.
		 * </pre>
		 *
		 * <code>optional string display_name = 3;</code>
		 */
		public boolean hasDisplayName() {
			return ((bitField0_ & 0x00000004) == 0x00000004);
		}

		/**
		 * <pre>
		 * Human readable string label.
		 * </pre>
		 *
		 * <code>optional string display_name = 3;</code>
		 */
		public String getDisplayName() {
			Object ref = displayName_;
			if (ref instanceof String) {
				return (String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				String s = bs.toStringUtf8();
				if (bs.isValidUtf8()) {
					displayName_ = s;
				}
				return s;
			}
		}

		/**
		 * <pre>
		 * Human readable string label.
		 * </pre>
		 *
		 * <code>optional string display_name = 3;</code>
		 */
		public com.google.protobuf.ByteString getDisplayNameBytes() {
			Object ref = displayName_;
			if (ref instanceof String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
				displayName_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized == 1)
				return true;
			if (isInitialized == 0)
				return false;

			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				output.writeInt32(2, id_);
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 3, displayName_);
			}
			unknownFields.writeTo(output);
		}

		public int getSerializedSize() {
			int size = memoizedSize;
			if (size != -1)
				return size;

			size = 0;
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, id_);
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, displayName_);
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
			if (!(obj instanceof StringIntLabelMapItem)) {
				return super.equals(obj);
			}
			StringIntLabelMapItem other = (StringIntLabelMapItem) obj;

			boolean result = true;
			result = result && (hasName() == other.hasName());
			if (hasName()) {
				result = result && getName().equals(other.getName());
			}
			result = result && (hasId() == other.hasId());
			if (hasId()) {
				result = result && (getId() == other.getId());
			}
			result = result && (hasDisplayName() == other.hasDisplayName());
			if (hasDisplayName()) {
				result = result && getDisplayName().equals(other.getDisplayName());
			}
			result = result && unknownFields.equals(other.unknownFields);
			return result;
		}

		@Override
		public int hashCode() {
			if (memoizedHashCode != 0) {
				return memoizedHashCode;
			}
			int hash = 41;
			hash = (19 * hash) + getDescriptor().hashCode();
			if (hasName()) {
				hash = (37 * hash) + NAME_FIELD_NUMBER;
				hash = (53 * hash) + getName().hashCode();
			}
			if (hasId()) {
				hash = (37 * hash) + ID_FIELD_NUMBER;
				hash = (53 * hash) + getId();
			}
			if (hasDisplayName()) {
				hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
				hash = (53 * hash) + getDisplayName().hashCode();
			}
			hash = (29 * hash) + unknownFields.hashCode();
			memoizedHashCode = hash;
			return hash;
		}

		public static StringIntLabelMapItem parseFrom(
				java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static StringIntLabelMapItem parseFrom(
				java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static StringIntLabelMapItem parseFrom(
				com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static StringIntLabelMapItem parseFrom(
				com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static StringIntLabelMapItem parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static StringIntLabelMapItem parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static StringIntLabelMapItem parseFrom(
				java.io.InputStream input) throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
		}

		public static StringIntLabelMapItem parseFrom(
				java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
		}

		public static StringIntLabelMapItem parseDelimitedFrom(
				java.io.InputStream input) throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
		}

		public static StringIntLabelMapItem parseDelimitedFrom(
				java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
					extensionRegistry);
		}

		public static StringIntLabelMapItem parseFrom(
				com.google.protobuf.CodedInputStream input) throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
		}

		public static StringIntLabelMapItem parseFrom(
				com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder() {
			return DEFAULT_INSTANCE.toBuilder();
		}

		public static Builder newBuilder(
				StringIntLabelMapItem prototype) {
			return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
		}

		@Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code object_detection.protos.StringIntLabelMapItem}
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
				// @@protoc_insertion_point(builder_implements:object_detection.protos.StringIntLabelMapItem)
				StringIntLabelMapItemOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return internal_static_object_detection_protos_StringIntLabelMapItem_descriptor;
			}

			protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
				return internal_static_object_detection_protos_StringIntLabelMapItem_fieldAccessorTable
						.ensureFieldAccessorsInitialized(
								StringIntLabelMapItem.class,
								StringIntLabelMapItem.Builder.class);
			}

			// Construct using
			// StringIntLabelMapItem.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
				}
			}

			public Builder clear() {
				super.clear();
				name_ = "";
				bitField0_ = (bitField0_ & ~0x00000001);
				id_ = 0;
				bitField0_ = (bitField0_ & ~0x00000002);
				displayName_ = "";
				bitField0_ = (bitField0_ & ~0x00000004);
				return this;
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return internal_static_object_detection_protos_StringIntLabelMapItem_descriptor;
			}

			public StringIntLabelMapItem getDefaultInstanceForType() {
				return StringIntLabelMapItem.getDefaultInstance();
			}

			public StringIntLabelMapItem build() {
				StringIntLabelMapItem result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public StringIntLabelMapItem buildPartial() {
				StringIntLabelMapItem result = new StringIntLabelMapItem(
						this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
					to_bitField0_ |= 0x00000001;
				}
				result.name_ = name_;
				if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
					to_bitField0_ |= 0x00000002;
				}
				result.id_ = id_;
				if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
					to_bitField0_ |= 0x00000004;
				}
				result.displayName_ = displayName_;
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder clone() {
				return (Builder) super.clone();
			}

			public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
				return (Builder) super.setField(field, value);
			}

			public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
				return (Builder) super.clearField(field);
			}

			public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
				return (Builder) super.clearOneof(oneof);
			}

			public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
					Object value) {
				return (Builder) super.setRepeatedField(field, index, value);
			}

			public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
					Object value) {
				return (Builder) super.addRepeatedField(field, value);
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof StringIntLabelMapItem) {
					return mergeFrom((StringIntLabelMapItem) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(StringIntLabelMapItem other) {
				if (other == StringIntLabelMapItem
						.getDefaultInstance())
					return this;
				if (other.hasName()) {
					bitField0_ |= 0x00000001;
					name_ = other.name_;
					onChanged();
				}
				if (other.hasId()) {
					setId(other.getId());
				}
				if (other.hasDisplayName()) {
					bitField0_ |= 0x00000004;
					displayName_ = other.displayName_;
					onChanged();
				}
				this.mergeUnknownFields(other.unknownFields);
				onChanged();
				return this;
			}

			public final boolean isInitialized() {
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				StringIntLabelMapItem parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (StringIntLabelMapItem) e
							.getUnfinishedMessage();
					throw e.unwrapIOException();
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			private Object name_ = "";

			/**
			 * <pre>
			 * String name. The most common practice is to set this to a MID or synsets
			 * id.
			 * </pre>
			 *
			 * <code>optional string name = 1;</code>
			 */
			public boolean hasName() {
				return ((bitField0_ & 0x00000001) == 0x00000001);
			}

			/**
			 * <pre>
			 * String name. The most common practice is to set this to a MID or synsets
			 * id.
			 * </pre>
			 *
			 * <code>optional string name = 1;</code>
			 */
			public String getName() {
				Object ref = name_;
				if (!(ref instanceof String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					String s = bs.toStringUtf8();
					if (bs.isValidUtf8()) {
						name_ = s;
					}
					return s;
				} else {
					return (String) ref;
				}
			}

			/**
			 * <pre>
			 * String name. The most common practice is to set this to a MID or synsets
			 * id.
			 * </pre>
			 *
			 * <code>optional string name = 1;</code>
			 */
			public com.google.protobuf.ByteString getNameBytes() {
				Object ref = name_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((String) ref);
					name_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <pre>
			 * String name. The most common practice is to set this to a MID or synsets
			 * id.
			 * </pre>
			 *
			 * <code>optional string name = 1;</code>
			 */
			public Builder setName(String value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000001;
				name_ = value;
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * String name. The most common practice is to set this to a MID or synsets
			 * id.
			 * </pre>
			 *
			 * <code>optional string name = 1;</code>
			 */
			public Builder clearName() {
				bitField0_ = (bitField0_ & ~0x00000001);
				name_ = getDefaultInstance().getName();
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * String name. The most common practice is to set this to a MID or synsets
			 * id.
			 * </pre>
			 *
			 * <code>optional string name = 1;</code>
			 */
			public Builder setNameBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000001;
				name_ = value;
				onChanged();
				return this;
			}

			private int id_;

			/**
			 * <pre>
			 * Integer id that maps to the string name above. Label ids should start from
			 * 1.
			 * </pre>
			 *
			 * <code>optional int32 id = 2;</code>
			 */
			public boolean hasId() {
				return ((bitField0_ & 0x00000002) == 0x00000002);
			}

			/**
			 * <pre>
			 * Integer id that maps to the string name above. Label ids should start from
			 * 1.
			 * </pre>
			 *
			 * <code>optional int32 id = 2;</code>
			 */
			public int getId() {
				return id_;
			}

			/**
			 * <pre>
			 * Integer id that maps to the string name above. Label ids should start from
			 * 1.
			 * </pre>
			 *
			 * <code>optional int32 id = 2;</code>
			 */
			public Builder setId(int value) {
				bitField0_ |= 0x00000002;
				id_ = value;
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * Integer id that maps to the string name above. Label ids should start from
			 * 1.
			 * </pre>
			 *
			 * <code>optional int32 id = 2;</code>
			 */
			public Builder clearId() {
				bitField0_ = (bitField0_ & ~0x00000002);
				id_ = 0;
				onChanged();
				return this;
			}

			private Object displayName_ = "";

			/**
			 * <pre>
			 * Human readable string label.
			 * </pre>
			 *
			 * <code>optional string display_name = 3;</code>
			 */
			public boolean hasDisplayName() {
				return ((bitField0_ & 0x00000004) == 0x00000004);
			}

			/**
			 * <pre>
			 * Human readable string label.
			 * </pre>
			 *
			 * <code>optional string display_name = 3;</code>
			 */
			public String getDisplayName() {
				Object ref = displayName_;
				if (!(ref instanceof String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					String s = bs.toStringUtf8();
					if (bs.isValidUtf8()) {
						displayName_ = s;
					}
					return s;
				} else {
					return (String) ref;
				}
			}

			/**
			 * <pre>
			 * Human readable string label.
			 * </pre>
			 *
			 * <code>optional string display_name = 3;</code>
			 */
			public com.google.protobuf.ByteString getDisplayNameBytes() {
				Object ref = displayName_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((String) ref);
					displayName_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <pre>
			 * Human readable string label.
			 * </pre>
			 *
			 * <code>optional string display_name = 3;</code>
			 */
			public Builder setDisplayName(String value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000004;
				displayName_ = value;
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * Human readable string label.
			 * </pre>
			 *
			 * <code>optional string display_name = 3;</code>
			 */
			public Builder clearDisplayName() {
				bitField0_ = (bitField0_ & ~0x00000004);
				displayName_ = getDefaultInstance().getDisplayName();
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * Human readable string label.
			 * </pre>
			 *
			 * <code>optional string display_name = 3;</code>
			 */
			public Builder setDisplayNameBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000004;
				displayName_ = value;
				onChanged();
				return this;
			}

			public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
				return super.setUnknownFields(unknownFields);
			}

			public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
				return super.mergeUnknownFields(unknownFields);
			}

			// @@protoc_insertion_point(builder_scope:object_detection.protos.StringIntLabelMapItem)
		}

		// @@protoc_insertion_point(class_scope:object_detection.protos.StringIntLabelMapItem)
		private static final StringIntLabelMapItem DEFAULT_INSTANCE;
		static {
			DEFAULT_INSTANCE = new StringIntLabelMapItem();
		}

		public static StringIntLabelMapItem getDefaultInstance() {
			return DEFAULT_INSTANCE;
		}

		@Deprecated
		public static final com.google.protobuf.Parser<StringIntLabelMapItem> PARSER = new com.google.protobuf.AbstractParser<StringIntLabelMapItem>() {
   public StringIntLabelMapItem parsePartialFrom(
       com.google.protobuf.CodedInputStream input,
       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
       throws com.google.protobuf.InvalidProtocolBufferException {
     return new StringIntLabelMapItem(input,extensionRegistry);}};

		public static com.google.protobuf.Parser<StringIntLabelMapItem> parser() {
			return PARSER;
		}

		@Override
		public com.google.protobuf.Parser<StringIntLabelMapItem> getParserForType() {
			return PARSER;
		}

		public StringIntLabelMapItem getDefaultInstanceForType() {
			return DEFAULT_INSTANCE;
		}

	}

	public interface StringIntLabelMapOrBuilder extends
			// @@protoc_insertion_point(interface_extends:object_detection.protos.StringIntLabelMap)
			com.google.protobuf.MessageOrBuilder {

		/**
		 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
		 */
		java.util.List<StringIntLabelMapItem> getItemList();

		/**
		 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
		 */
		StringIntLabelMapItem getItem(int index);

		/**
		 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
		 */
		int getItemCount();

		/**
		 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
		 */
		java.util.List<? extends StringIntLabelMapItemOrBuilder> getItemOrBuilderList();

		/**
		 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
		 */
		StringIntLabelMapItemOrBuilder getItemOrBuilder(int index);
	}

	/**
	 * Protobuf type {@code object_detection.protos.StringIntLabelMap}
	 */
	public static final class StringIntLabelMap extends com.google.protobuf.GeneratedMessageV3 implements
			// @@protoc_insertion_point(message_implements:object_detection.protos.StringIntLabelMap)
			StringIntLabelMapOrBuilder {
		private static final long serialVersionUID = 0L;

		// Use StringIntLabelMap.newBuilder() to construct.
		private StringIntLabelMap(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
			super(builder);
		}

		private StringIntLabelMap() {
			item_ = java.util.Collections.emptyList();
		}

		@Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private StringIntLabelMap(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			this();
			if (extensionRegistry == null) {
				throw new NullPointerException();
			}
			int mutable_bitField0_ = 0;
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 10: {
						if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
							item_ = new java.util.ArrayList<StringIntLabelMapItem>();
							mutable_bitField0_ |= 0x00000001;
						}
						item_.add(input.readMessage(
								StringIntLabelMapItem.PARSER,
								extensionRegistry));
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
			} finally {
				if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
					item_ = java.util.Collections.unmodifiableList(item_);
				}
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return internal_static_object_detection_protos_StringIntLabelMap_descriptor;
		}

		protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
			return internal_static_object_detection_protos_StringIntLabelMap_fieldAccessorTable
					.ensureFieldAccessorsInitialized(
							StringIntLabelMap.class,
							StringIntLabelMap.Builder.class);
		}

		public static final int ITEM_FIELD_NUMBER = 1;
		private java.util.List<StringIntLabelMapItem> item_;

		/**
		 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
		 */
		public java.util.List<StringIntLabelMapItem> getItemList() {
			return item_;
		}

		/**
		 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
		 */
		public java.util.List<? extends StringIntLabelMapItemOrBuilder> getItemOrBuilderList() {
			return item_;
		}

		/**
		 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
		 */
		public int getItemCount() {
			return item_.size();
		}

		/**
		 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
		 */
		public StringIntLabelMapItem getItem(int index) {
			return item_.get(index);
		}

		/**
		 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
		 */
		public StringIntLabelMapItemOrBuilder getItemOrBuilder(
				int index) {
			return item_.get(index);
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized == 1)
				return true;
			if (isInitialized == 0)
				return false;

			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			for (int i = 0; i < item_.size(); i++) {
				output.writeMessage(1, item_.get(i));
			}
			unknownFields.writeTo(output);
		}

		public int getSerializedSize() {
			int size = memoizedSize;
			if (size != -1)
				return size;

			size = 0;
			for (int i = 0; i < item_.size(); i++) {
				size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, item_.get(i));
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
			if (!(obj instanceof StringIntLabelMap)) {
				return super.equals(obj);
			}
			StringIntLabelMap other = (StringIntLabelMap) obj;

			boolean result = true;
			result = result && getItemList().equals(other.getItemList());
			result = result && unknownFields.equals(other.unknownFields);
			return result;
		}

		@Override
		public int hashCode() {
			if (memoizedHashCode != 0) {
				return memoizedHashCode;
			}
			int hash = 41;
			hash = (19 * hash) + getDescriptor().hashCode();
			if (getItemCount() > 0) {
				hash = (37 * hash) + ITEM_FIELD_NUMBER;
				hash = (53 * hash) + getItemList().hashCode();
			}
			hash = (29 * hash) + unknownFields.hashCode();
			memoizedHashCode = hash;
			return hash;
		}

		public static StringIntLabelMap parseFrom(
				java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static StringIntLabelMap parseFrom(
				java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static StringIntLabelMap parseFrom(
				com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static StringIntLabelMap parseFrom(
				com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static StringIntLabelMap parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static StringIntLabelMap parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static StringIntLabelMap parseFrom(
				java.io.InputStream input) throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
		}

		public static StringIntLabelMap parseFrom(
				java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
		}

		public static StringIntLabelMap parseDelimitedFrom(
				java.io.InputStream input) throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
		}

		public static StringIntLabelMap parseDelimitedFrom(
				java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
					extensionRegistry);
		}

		public static StringIntLabelMap parseFrom(
				com.google.protobuf.CodedInputStream input) throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
		}

		public static StringIntLabelMap parseFrom(
				com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder() {
			return DEFAULT_INSTANCE.toBuilder();
		}

		public static Builder newBuilder(
				StringIntLabelMap prototype) {
			return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
		}

		@Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code object_detection.protos.StringIntLabelMap}
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
				// @@protoc_insertion_point(builder_implements:object_detection.protos.StringIntLabelMap)
				StringIntLabelMapOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return internal_static_object_detection_protos_StringIntLabelMap_descriptor;
			}

			protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
				return internal_static_object_detection_protos_StringIntLabelMap_fieldAccessorTable
						.ensureFieldAccessorsInitialized(
								StringIntLabelMap.class,
								StringIntLabelMap.Builder.class);
			}

			// Construct using
			// StringIntLabelMap.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
					getItemFieldBuilder();
				}
			}

			public Builder clear() {
				super.clear();
				if (itemBuilder_ == null) {
					item_ = java.util.Collections.emptyList();
					bitField0_ = (bitField0_ & ~0x00000001);
				} else {
					itemBuilder_.clear();
				}
				return this;
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return internal_static_object_detection_protos_StringIntLabelMap_descriptor;
			}

			public StringIntLabelMap getDefaultInstanceForType() {
				return StringIntLabelMap.getDefaultInstance();
			}

			public StringIntLabelMap build() {
				StringIntLabelMap result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public StringIntLabelMap buildPartial() {
				StringIntLabelMap result = new StringIntLabelMap(
						this);
				int from_bitField0_ = bitField0_;
				if (itemBuilder_ == null) {
					if (((bitField0_ & 0x00000001) == 0x00000001)) {
						item_ = java.util.Collections.unmodifiableList(item_);
						bitField0_ = (bitField0_ & ~0x00000001);
					}
					result.item_ = item_;
				} else {
					result.item_ = itemBuilder_.build();
				}
				onBuilt();
				return result;
			}

			public Builder clone() {
				return (Builder) super.clone();
			}

			public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
				return (Builder) super.setField(field, value);
			}

			public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
				return (Builder) super.clearField(field);
			}

			public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
				return (Builder) super.clearOneof(oneof);
			}

			public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
					Object value) {
				return (Builder) super.setRepeatedField(field, index, value);
			}

			public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
					Object value) {
				return (Builder) super.addRepeatedField(field, value);
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof StringIntLabelMap) {
					return mergeFrom((StringIntLabelMap) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(StringIntLabelMap other) {
				if (other == StringIntLabelMap.getDefaultInstance())
					return this;
				if (itemBuilder_ == null) {
					if (!other.item_.isEmpty()) {
						if (item_.isEmpty()) {
							item_ = other.item_;
							bitField0_ = (bitField0_ & ~0x00000001);
						} else {
							ensureItemIsMutable();
							item_.addAll(other.item_);
						}
						onChanged();
					}
				} else {
					if (!other.item_.isEmpty()) {
						if (itemBuilder_.isEmpty()) {
							itemBuilder_.dispose();
							itemBuilder_ = null;
							item_ = other.item_;
							bitField0_ = (bitField0_ & ~0x00000001);
							itemBuilder_ = com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
									? getItemFieldBuilder()
									: null;
						} else {
							itemBuilder_.addAllMessages(other.item_);
						}
					}
				}
				this.mergeUnknownFields(other.unknownFields);
				onChanged();
				return this;
			}

			public final boolean isInitialized() {
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				StringIntLabelMap parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (StringIntLabelMap) e
							.getUnfinishedMessage();
					throw e.unwrapIOException();
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			private java.util.List<StringIntLabelMapItem> item_ = java.util.Collections
					.emptyList();

			private void ensureItemIsMutable() {
				if (!((bitField0_ & 0x00000001) == 0x00000001)) {
					item_ = new java.util.ArrayList<StringIntLabelMapItem>(
							item_);
					bitField0_ |= 0x00000001;
				}
			}

			private com.google.protobuf.RepeatedFieldBuilderV3<StringIntLabelMapItem, StringIntLabelMapItem.Builder, StringIntLabelMapItemOrBuilder> itemBuilder_;

			/**
			 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
			 */
			public java.util.List<StringIntLabelMapItem> getItemList() {
				if (itemBuilder_ == null) {
					return java.util.Collections.unmodifiableList(item_);
				} else {
					return itemBuilder_.getMessageList();
				}
			}

			/**
			 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
			 */
			public int getItemCount() {
				if (itemBuilder_ == null) {
					return item_.size();
				} else {
					return itemBuilder_.getCount();
				}
			}

			/**
			 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
			 */
			public StringIntLabelMapItem getItem(int index) {
				if (itemBuilder_ == null) {
					return item_.get(index);
				} else {
					return itemBuilder_.getMessage(index);
				}
			}

			/**
			 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
			 */
			public Builder setItem(int index,
					StringIntLabelMapItem value) {
				if (itemBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureItemIsMutable();
					item_.set(index, value);
					onChanged();
				} else {
					itemBuilder_.setMessage(index, value);
				}
				return this;
			}

			/**
			 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
			 */
			public Builder setItem(int index,
					StringIntLabelMapItem.Builder builderForValue) {
				if (itemBuilder_ == null) {
					ensureItemIsMutable();
					item_.set(index, builderForValue.build());
					onChanged();
				} else {
					itemBuilder_.setMessage(index, builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
			 */
			public Builder addItem(StringIntLabelMapItem value) {
				if (itemBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureItemIsMutable();
					item_.add(value);
					onChanged();
				} else {
					itemBuilder_.addMessage(value);
				}
				return this;
			}

			/**
			 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
			 */
			public Builder addItem(int index,
					StringIntLabelMapItem value) {
				if (itemBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureItemIsMutable();
					item_.add(index, value);
					onChanged();
				} else {
					itemBuilder_.addMessage(index, value);
				}
				return this;
			}

			/**
			 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
			 */
			public Builder addItem(
					StringIntLabelMapItem.Builder builderForValue) {
				if (itemBuilder_ == null) {
					ensureItemIsMutable();
					item_.add(builderForValue.build());
					onChanged();
				} else {
					itemBuilder_.addMessage(builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
			 */
			public Builder addItem(int index,
					StringIntLabelMapItem.Builder builderForValue) {
				if (itemBuilder_ == null) {
					ensureItemIsMutable();
					item_.add(index, builderForValue.build());
					onChanged();
				} else {
					itemBuilder_.addMessage(index, builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
			 */
			public Builder addAllItem(
					Iterable<? extends StringIntLabelMapItem> values) {
				if (itemBuilder_ == null) {
					ensureItemIsMutable();
					com.google.protobuf.AbstractMessageLite.Builder.addAll(values, item_);
					onChanged();
				} else {
					itemBuilder_.addAllMessages(values);
				}
				return this;
			}

			/**
			 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
			 */
			public Builder clearItem() {
				if (itemBuilder_ == null) {
					item_ = java.util.Collections.emptyList();
					bitField0_ = (bitField0_ & ~0x00000001);
					onChanged();
				} else {
					itemBuilder_.clear();
				}
				return this;
			}

			/**
			 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
			 */
			public Builder removeItem(int index) {
				if (itemBuilder_ == null) {
					ensureItemIsMutable();
					item_.remove(index);
					onChanged();
				} else {
					itemBuilder_.remove(index);
				}
				return this;
			}

			/**
			 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
			 */
			public StringIntLabelMapItem.Builder getItemBuilder(
					int index) {
				return getItemFieldBuilder().getBuilder(index);
			}

			/**
			 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
			 */
			public StringIntLabelMapItemOrBuilder getItemOrBuilder(
					int index) {
				if (itemBuilder_ == null) {
					return item_.get(index);
				} else {
					return itemBuilder_.getMessageOrBuilder(index);
				}
			}

			/**
			 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
			 */
			public java.util.List<? extends StringIntLabelMapItemOrBuilder> getItemOrBuilderList() {
				if (itemBuilder_ != null) {
					return itemBuilder_.getMessageOrBuilderList();
				} else {
					return java.util.Collections.unmodifiableList(item_);
				}
			}

			/**
			 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
			 */
			public StringIntLabelMapItem.Builder addItemBuilder() {
				return getItemFieldBuilder().addBuilder(
						StringIntLabelMapItem.getDefaultInstance());
			}

			/**
			 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
			 */
			public StringIntLabelMapItem.Builder addItemBuilder(
					int index) {
				return getItemFieldBuilder().addBuilder(index,
						StringIntLabelMapItem.getDefaultInstance());
			}

			/**
			 * <code>repeated .object_detection.protos.StringIntLabelMapItem item = 1;</code>
			 */
			public java.util.List<StringIntLabelMapItem.Builder> getItemBuilderList() {
				return getItemFieldBuilder().getBuilderList();
			}

			private com.google.protobuf.RepeatedFieldBuilderV3<StringIntLabelMapItem, StringIntLabelMapItem.Builder, StringIntLabelMapItemOrBuilder> getItemFieldBuilder() {
				if (itemBuilder_ == null) {
					itemBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<StringIntLabelMapItem, StringIntLabelMapItem.Builder, StringIntLabelMapItemOrBuilder>(
							item_, ((bitField0_ & 0x00000001) == 0x00000001), getParentForChildren(), isClean());
					item_ = null;
				}
				return itemBuilder_;
			}

			public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
				return super.setUnknownFields(unknownFields);
			}

			public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
				return super.mergeUnknownFields(unknownFields);
			}

			// @@protoc_insertion_point(builder_scope:object_detection.protos.StringIntLabelMap)
		}

		// @@protoc_insertion_point(class_scope:object_detection.protos.StringIntLabelMap)
		private static final StringIntLabelMap DEFAULT_INSTANCE;
		static {
			DEFAULT_INSTANCE = new StringIntLabelMap();
		}

		public static StringIntLabelMap getDefaultInstance() {
			return DEFAULT_INSTANCE;
		}

		@Deprecated
		public static final com.google.protobuf.Parser<StringIntLabelMap> PARSER = new com.google.protobuf.AbstractParser<StringIntLabelMap>() {
   public StringIntLabelMap parsePartialFrom(
       com.google.protobuf.CodedInputStream input,
       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
       throws com.google.protobuf.InvalidProtocolBufferException {
     return new StringIntLabelMap(input,extensionRegistry);}};

		public static com.google.protobuf.Parser<StringIntLabelMap> parser() {
			return PARSER;
		}

		@Override
		public com.google.protobuf.Parser<StringIntLabelMap> getParserForType() {
			return PARSER;
		}

		public StringIntLabelMap getDefaultInstanceForType() {
			return DEFAULT_INSTANCE;
		}

	}

	private static final com.google.protobuf.Descriptors.Descriptor internal_static_object_detection_protos_StringIntLabelMapItem_descriptor;
	private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_object_detection_protos_StringIntLabelMapItem_fieldAccessorTable;
	private static final com.google.protobuf.Descriptors.Descriptor internal_static_object_detection_protos_StringIntLabelMap_descriptor;
	private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_object_detection_protos_StringIntLabelMap_fieldAccessorTable;

	public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
		return descriptor;
	}

	private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
	static {
		String[] descriptorData = { "\n\032string_int_label_map.proto\022\027object_det"
				+ "ection.protos\"G\n\025StringIntLabelMapItem\022\014"
				+ "\n\004name\030\001 \001(\t\022\n\n\002id\030\002 \001(\005\022\024\n\014display_name"
				+ "\030\003 \001(\t\"Q\n\021StringIntLabelMap\022<\n\004item\030\001 \003("
				+ "\0132..object_detection.protos.StringIntLab" + "elMapItem" };
		com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
			public com.google.protobuf.ExtensionRegistry assignDescriptors(
					com.google.protobuf.Descriptors.FileDescriptor root) {
				descriptor = root;
				return null;
			}
		};
		com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData,
				new com.google.protobuf.Descriptors.FileDescriptor[] {}, assigner);
		internal_static_object_detection_protos_StringIntLabelMapItem_descriptor = getDescriptor().getMessageTypes()
				.get(0);
		internal_static_object_detection_protos_StringIntLabelMapItem_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
				internal_static_object_detection_protos_StringIntLabelMapItem_descriptor,
				new String[] { "Name", "Id", "DisplayName", });
		internal_static_object_detection_protos_StringIntLabelMap_descriptor = getDescriptor().getMessageTypes().get(1);
		internal_static_object_detection_protos_StringIntLabelMap_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
				internal_static_object_detection_protos_StringIntLabelMap_descriptor,
				new String[] { "Item", });
	}

// @@protoc_insertion_point(outer_class_scope)
}
