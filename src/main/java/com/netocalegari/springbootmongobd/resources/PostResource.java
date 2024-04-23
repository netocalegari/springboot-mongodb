package com.netocalegari.springbootmongobd.resources;

import com.netocalegari.springbootmongobd.domain.Post;
import com.netocalegari.springbootmongobd.domain.User;
import com.netocalegari.springbootmongobd.dto.UserDTO;
import com.netocalegari.springbootmongobd.services.PostService;
import com.netocalegari.springbootmongobd.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value="/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = service.findById(id);

        return ResponseEntity.ok().body(obj);
    }
}
