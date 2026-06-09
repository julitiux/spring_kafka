package com.spring_kafka.consumer;

import com.spring_kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaJsonConsumer {

  @KafkaListener(topics = "quickstart-events", groupId = "myGroup")
  public void consumeJsonMessage(Student student) {

    log.info(String.format("Consuming the message from quickstart-events Topi :: %s", student));
  }
}
