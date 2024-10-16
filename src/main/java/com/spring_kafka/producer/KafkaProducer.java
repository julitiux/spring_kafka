package com.spring_kafka.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {

  private final KafkaTemplate<String, String> kafkaTemplate;

  public void sendMessage(String message) {

    log.info("Sending message to quickstart-events Topic:: {}", message);
    kafkaTemplate.send("quickstart-events", message);
  }

}
