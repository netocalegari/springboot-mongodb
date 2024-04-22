package com.netocalegari.springbootmongobd.repository;

import com.netocalegari.springbootmongobd.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
