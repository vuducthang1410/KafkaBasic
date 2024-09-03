package com.example.demo.service.consumer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestConsumerService {
    @KafkaListener(topics = "my-topic",groupId = "my-group")
    public void listen(String message){
        System.out.println("Receiver message : "+message);
    }
}
