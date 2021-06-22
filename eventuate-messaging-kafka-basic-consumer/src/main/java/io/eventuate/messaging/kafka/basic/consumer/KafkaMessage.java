package io.eventuate.messaging.kafka.basic.consumer;

public class KafkaMessage {
  private String payload;

  public KafkaMessage(String payload) {
    this.payload = payload;
  }

  public String getPayload() {
    return payload;
  }
}
