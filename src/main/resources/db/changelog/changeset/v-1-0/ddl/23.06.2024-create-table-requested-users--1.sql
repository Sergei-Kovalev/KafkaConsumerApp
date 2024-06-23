--liquibase formatted sql
--changeset Sergey Kovalev:1

CREATE TABLE requested_users (
    id SERIAL NOT NULL,
    user_id BIGINT,
    request_time TIMESTAMP,
    PRIMARY KEY (id)
);