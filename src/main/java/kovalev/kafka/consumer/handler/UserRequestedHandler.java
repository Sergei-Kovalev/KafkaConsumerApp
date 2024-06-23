package kovalev.kafka.consumer.handler;

import kovalev.kafka.consumer.service.kafka.event.EventForKafka;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(topics = "requested-users-from-server-db")
public class UserRequestedHandler {

    @KafkaHandler
    public void handle(EventForKafka event) {
        LOGGER.warn("THIS IS STUB FOR SAVING THIS EVENT: {}", event);
    }

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
}
