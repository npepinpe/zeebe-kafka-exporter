package io.zeebe.exporters.kafka.serde.generic;

import com.google.protobuf.Message;
import io.zeebe.exporter.proto.Schema;
import java.util.HashMap;
import java.util.Map;

public class SchemaTypes {
  static final Map<String, Message> TYPE_MAP = new HashMap<>();

  static {
    addType(Schema.DeploymentRecord.getDefaultInstance());
    addType(Schema.ErrorRecord.getDefaultInstance());
    addType(Schema.IncidentRecord.getDefaultInstance());
    addType(Schema.JobRecord.getDefaultInstance());
    addType(Schema.JobBatchRecord.getDefaultInstance());
    addType(Schema.MessageRecord.getDefaultInstance());
    addType(Schema.MessageStartEventSubscriptionRecord.getDefaultInstance());
    addType(Schema.MessageSubscriptionRecord.getDefaultInstance());
    addType(Schema.RecordId.getDefaultInstance());
    addType(Schema.RecordMetadata.getDefaultInstance());
    addType(Schema.TimerRecord.getDefaultInstance());
    addType(Schema.VariableRecord.getDefaultInstance());
    addType(Schema.VariableDocumentRecord.getDefaultInstance());
    addType(Schema.WorkflowInstanceRecord.getDefaultInstance());
    addType(Schema.WorkflowInstanceCreationRecord.getDefaultInstance());
    addType(Schema.WorkflowInstanceSubscriptionRecord.getDefaultInstance());
  }

  public static Message getDefaultInstanceForType(String typeName) {
    return TYPE_MAP.get(typeName);
  }

  private static <T extends Message> void addType(T type) {
    TYPE_MAP.put(type.getDescriptorForType().getName(), type);
  }
}
