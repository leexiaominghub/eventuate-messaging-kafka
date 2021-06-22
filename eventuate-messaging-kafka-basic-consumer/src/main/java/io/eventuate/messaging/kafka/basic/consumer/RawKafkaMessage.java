package io.eventuate.messaging.kafka.basic.consumer;

public class RawKafkaMessage {
  private byte[] payload;

  public RawKafkaMessage(byte[] payload) {
    this.payload = payload;
  }

  public byte[] getPayload() {
    return payload;
  }
}
