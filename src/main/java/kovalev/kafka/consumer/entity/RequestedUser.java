package kovalev.kafka.consumer.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@Table(name = "requested_users")
public class RequestedUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "user_id")
    private long userID;

    @Column(name = "request_time")
    private LocalDateTime requestTime;

    public RequestedUser(long userID, LocalDateTime requestTime) {
        this.userID = userID;
        this.requestTime = requestTime;
    }
}
