package com.example.thales.Kafka.Subscriber;

import com.example.thales.Kafka.Message;

public interface Subscriber {
    void update(Message message);
}
