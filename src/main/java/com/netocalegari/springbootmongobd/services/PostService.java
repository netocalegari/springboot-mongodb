package com.netocalegari.springbootmongobd.services;

import com.netocalegari.springbootmongobd.domain.Post;
import com.netocalegari.springbootmongobd.domain.User;
import com.netocalegari.springbootmongobd.dto.UserDTO;
import com.netocalegari.springbootmongobd.repository.PostRepository;
import com.netocalegari.springbootmongobd.repository.UserRepository;
import com.netocalegari.springbootmongobd.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found!"));
    }

    public List<Post> findByTitle(String text) {
        return repo.searchTitle(text);
    }

    public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
        maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
        return repo.fullSearch(text, minDate, maxDate);
    }
}
