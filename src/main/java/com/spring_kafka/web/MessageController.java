package com.spring_kafka.web;

import com.spring_kafka.producer.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/messages")
public class MessageController {

  private final KafkaProducer producer;

  public MessageController(KafkaProducer producer) {
    this.producer = producer;
  }

  @PostMapping()
  public ResponseEntity<String> sendMessage(@RequestBody String message){

    producer.sendMessage(message);
    return ResponseEntity.ok().body("Message queued successfully");
  }
}
