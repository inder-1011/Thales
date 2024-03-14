package com.example.thales.Kafka.Publisher;

import com.example.thales.Kafka.Message;

public interface Publisher {
        void publish(Message message);
}
