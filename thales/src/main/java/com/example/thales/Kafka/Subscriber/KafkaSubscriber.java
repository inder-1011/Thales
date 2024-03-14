package com.example.thales.Kafka.Subscriber;

import com.example.thales.Kafka.Message;

public class KafkaSubscriber implements Subscriber{
    private String name;

    public KafkaSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Message message) {
        System.out.println(name + " received message: " + message.getMessage());
    }
}
