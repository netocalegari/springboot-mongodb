package com.netocalegari.springbootmongobd.repository;

import com.netocalegari.springbootmongobd.domain.Post;
import com.netocalegari.springbootmongobd.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    List<Post> findByTitleContainingIgnoreCase(String text);
}
