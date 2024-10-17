package com.spring_kafka.consumer;

import com.spring_kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

//  @KafkaListener(topics = "quickstart-events", groupId = "myGroup")
  public void consumerMessage(String message) {

    log.info("Consuming the message from quickstart-events Topic:: {}", message);
  }


  @KafkaListener(topics = "quickstart-events", groupId = "myGroup")
  public void consumerJsonMessage(Student student) {

    log.info("Consuming the message from quickstart-events Topic:: {}", student.toString());
  }

}
