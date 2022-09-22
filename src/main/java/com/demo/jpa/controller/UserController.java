package com.demo.jpa.controller;

import com.demo.jpa.Entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.demo.jpa.service.UserService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public Person addUser(@RequestBody Person user) {
        return userService.createUser(user);
    }

    @PostMapping("/addUsers")
    public List<Person> addUsers(@RequestBody List<Person> users) {
        return userService.createUsers(users);
    }

    @GetMapping("/user/{id}")
    public Person getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @GetMapping("/users")
    public List<Person> getAllUsers() {
        return userService.getUsers();
    }

    @PutMapping("/updateuser")
    public Person updateUser(@RequestBody Person user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable int id) {
        return userService.deleteUserById(id);
    }
}
