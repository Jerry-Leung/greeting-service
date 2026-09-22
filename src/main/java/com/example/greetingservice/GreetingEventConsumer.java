package com.example.greetingservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class GreetingEventConsumer {

    private static final Logger log = LoggerFactory.getLogger(GreetingEventConsumer.class);

    @KafkaListener(topics = "greeting-events", groupId = "greeting-service")
    public void consume(GreetingRequestedEvent event) {
        log.info("Consumed GreetingRequestedEvent: requestId={}, message='{}', timestamp={}",
                event.requestId(), event.message(), event.timestamp());
    }
}
