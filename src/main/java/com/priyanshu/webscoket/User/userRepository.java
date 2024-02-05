package com.priyanshu.webscoket.User;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface userRepository extends MongoRepository<User ,String> {

    List<User> findAllByStatus(Status status);
}
