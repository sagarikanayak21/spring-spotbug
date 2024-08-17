package com.sn.spotbug.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sn.spotbug.dto.User;



@Repository
public interface UserRepository extends MongoRepository<User, String> {
}