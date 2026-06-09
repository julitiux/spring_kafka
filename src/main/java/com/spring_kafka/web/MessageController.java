package com.spring_kafka.web;

import com.spring_kafka.payload.Student;
import com.spring_kafka.producer.KafkaJsonProducer;
import com.spring_kafka.producer.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/messages")
public class MessageController {

  private final KafkaProducer kafkaProducer;
  private final KafkaJsonProducer kafkaJsonProducer;

  public MessageController(KafkaProducer producer, KafkaJsonProducer kafkaJsonProducer) {
    this.kafkaProducer = producer;
    this.kafkaJsonProducer = kafkaJsonProducer;
  }

  @PostMapping()
  public ResponseEntity<String> sendMessage(@RequestBody String message) {

    kafkaProducer.sendMessage(message);
    return ResponseEntity.ok().body("Message queued successfully");
  }

  @PostMapping("/json")
  public ResponseEntity<String> sendJsonMessage(@RequestBody Student message) {

    kafkaJsonProducer.sendMessage(message);
    return ResponseEntity.ok().body("Message queued successfully as JSON");
  }
}
