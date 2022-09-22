package com.demo.jpa.service;

import com.demo.jpa.Entity.Person;
import com.demo.jpa.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Person createUser(Person user) {
        return userRepository.save(user);
    }

    public List<Person> createUsers(List<Person> users) {
        return userRepository.saveAll(users);
    }

    public Person getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<Person> getUsers() {
        return userRepository.findAll();
    }

    public Person updateUser(Person user) {
        Person oldUser = null;
        Optional<Person> optionaluser = userRepository.findById(user.getId());
        if (optionaluser.isPresent()) {
            oldUser = optionaluser.get();
            oldUser.setName(user.getName());
            oldUser.setAddress(user.getAddress());
            userRepository.save(oldUser);
        } else {
            return new Person();
        }
        return oldUser;
    }

    public String deleteUserById(int id) {
        userRepository.deleteById(id);
        return "User got deleted";
    }
}
