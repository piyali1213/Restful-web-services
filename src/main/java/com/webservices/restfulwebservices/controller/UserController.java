package com.webservices.restfulwebservices.controller;

import com.webservices.restfulwebservices.entity.UserSocialMedia;
import com.webservices.restfulwebservices.service.UserDaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

     private UserDaoService service;

    public UserController(UserDaoService service) {
        this.service = service;
    }


@GetMapping("/users")
    public List<UserSocialMedia> findAll()
    {
       return service.findAll();
    }
    @GetMapping("/users/{userId}")
    public UserSocialMedia findOneUser(@PathVariable int userId)  {
        UserSocialMedia user =service.findById(userId);
        if(user== null)
            throw new UserNotNotFoundException("id " +userId);
            return user;

    }
@PostMapping("/users")
    public ResponseEntity<UserSocialMedia> createUser(@RequestBody UserSocialMedia user)
    {
        UserSocialMedia savedUser=service.saveUser(user);
        URI location= ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{userId}")
                .buildAndExpand(savedUser.getUserId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
    @DeleteMapping("users/{id}")
    public void deleteUser(@PathVariable int id)
    {
        service.deleteById(id);
    }
}

