package com.example.thales.Kafka;

import com.example.thales.Kafka.Subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    private List<Subscriber> subscribers;

    public Topic() {
        this.subscribers = new ArrayList<>();
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(Message message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }

}
