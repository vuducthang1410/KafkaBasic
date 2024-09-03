package com.example.demo.controller;

import com.example.demo.service.producer.TestProducerService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TestKafkaController {
    private final TestProducerService producerService;
    @GetMapping("/send-message")
    public String sendMessage(){
        producerService.sendMessage("my-topic","hello vu duc thang");
        return "send message success";
    }
}
