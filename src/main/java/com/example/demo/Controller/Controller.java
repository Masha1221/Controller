package com.example.demo.Controller;


import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {


    @PostMapping("/users/create")
    public User createUser(@RequestBody User user){
        System.out.println("User is created");
    }

    @GetMapping("/users/{id}")
    public List<User> readAllUser(@PathVariable Integer id){
        System.out.println("Read all users.");
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Integer id, @RequestBody User user ){
        System.out.println("User is updated.");
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Integer id){
        System.out.println("User is deleted.");
    }











}
