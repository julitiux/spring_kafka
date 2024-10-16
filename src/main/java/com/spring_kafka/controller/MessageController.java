package com.spring_kafka.controller;

import com.spring_kafka.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class MessageController {

  private final KafkaProducer kafkaProducer;
}
