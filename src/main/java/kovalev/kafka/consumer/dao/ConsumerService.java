package kovalev.kafka.consumer.dao;

import kovalev.kafka.consumer.entity.RequestedUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerService extends CrudRepository<RequestedUser, Long> {

    RequestedUser saveAndFlush(RequestedUser entity);

}
