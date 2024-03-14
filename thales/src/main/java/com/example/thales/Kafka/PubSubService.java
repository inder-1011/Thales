package com.example.thales.Kafka;

import com.example.thales.Kafka.Publisher.KafkaPublisher;
import com.example.thales.Kafka.Subscriber.KafkaSubscriber;

public class PubSubService {

    public static void main(String[] args) {
        Topic topic = new Topic();
        Topic topic2 = new Topic();

        // Create subscribers
        KafkaSubscriber subscriber1 = new KafkaSubscriber("Subscriber 1");
        KafkaSubscriber subscriber2 = new KafkaSubscriber("Subscriber 2");
        KafkaSubscriber subscriber3 = new KafkaSubscriber("Subscriber 3");
        KafkaSubscriber subscriber4 = new KafkaSubscriber("Subscriber 4");

        //topic-1
        topic.addSubscriber(subscriber1);
        topic.addSubscriber(subscriber3);

        //topic-2
        topic2.addSubscriber(subscriber2);
        topic2.addSubscriber(subscriber4);

        // Create publisher with the topic
        KafkaPublisher kafkaPublisher = new KafkaPublisher(topic);
        KafkaPublisher kafkaPublisher1 = new KafkaPublisher(topic2);

        // Publish messages
        kafkaPublisher.publish(new Message("Message-1-PUB-1"));
        kafkaPublisher.publish(new Message("Message-2-PUB-1"));

        kafkaPublisher1.publish(new Message("Message-1-PUB-2"));
        kafkaPublisher1.publish(new Message("Message-2-PUB-2"));

    }
}
