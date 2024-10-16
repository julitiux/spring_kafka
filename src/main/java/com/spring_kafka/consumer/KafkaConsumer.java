package com.spring_kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

  @KafkaListener
  public void consumerMessage(String message) {

    log.info("Consuming the message from quickstart-events Topic:: {}", message);
  }

}
