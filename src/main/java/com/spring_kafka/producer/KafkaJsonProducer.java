package com.spring_kafka.producer;

import com.spring_kafka.payload.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaJsonProducer {

  private final KafkaTemplate<String, Student> kafkaTemplate;

}
