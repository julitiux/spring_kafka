package com.spring_kafka.producer;

import com.spring_kafka.payload.Student;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaJsonProducer {

  private final KafkaTemplate<String, Student> kafkaTemplate;

  public KafkaJsonProducer(KafkaTemplate<String, Student> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }
}
