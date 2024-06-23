DROP TABLE IF EXISTS requested_users;

CREATE TABLE requested_users (
    id SERIAL NOT NULL,
    user_id BIGINT,
    request_time TIMESTAMP,
    PRIMARY KEY (id)
);