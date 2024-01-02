package com.marcusvinicius.api_restful.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marcusvinicius.api_restful.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}