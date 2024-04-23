package com.netocalegari.springbootmongobd.services;

import com.netocalegari.springbootmongobd.domain.User;
import com.netocalegari.springbootmongobd.dto.UserDTO;
import com.netocalegari.springbootmongobd.repository.UserRepository;
import com.netocalegari.springbootmongobd.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repo.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found!"));
    }

    public User insert(User obj) {
        return repo.insert(obj);
    }

    public void delete(String id) {
        findById(id);
        repo.deleteById(id);
    }

    public User fromDTO(UserDTO objDTO) {
        return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
    }
}
