package com.netocalegari.springbootmongobd.services;

import com.netocalegari.springbootmongobd.domain.User;
import com.netocalegari.springbootmongobd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}
