package kovalev.kafka.consumer.service.kafka.handler;

import kovalev.kafka.consumer.dao.ConsumerService;
import kovalev.kafka.consumer.entity.RequestedUser;
import kovalev.kafka.consumer.service.kafka.event.EventForKafka;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(topics = "requested-users-from-server-db")
public class UserRequestedHandler {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ConsumerService service;

    @KafkaHandler
    public void handle(EventForKafka event) {

        RequestedUser requestedUser = service.saveAndFlush(
                new RequestedUser(event.getUserID(), event.getRequestTime()));

        LOGGER.info("--- The event is saved in the DB: {}", requestedUser);
    }
}
