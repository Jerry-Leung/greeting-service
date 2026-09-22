package com.example.greetingservice;

import java.time.Instant;

/**
 * Event consumed from the "greeting-events" Kafka topic.
 * Published by hello-world, consumed here by greeting-service.
 */
public record GreetingRequestedEvent(
        String requestId,
        String message,
        Instant timestamp
) {}
