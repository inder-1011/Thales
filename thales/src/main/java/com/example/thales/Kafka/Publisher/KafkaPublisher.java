package com.example.thales.Kafka.Publisher;

import com.example.thales.Kafka.Message;
import com.example.thales.Kafka.Topic;

public class KafkaPublisher implements Publisher{
    private Topic topic;

    public KafkaPublisher(Topic topic) {
        this.topic = topic;
    }
    @Override
    public void publish(Message message) {
        System.out.println("Publishing message: " + message.getMessage());
        topic.notifySubscribers(message);
    }
}
