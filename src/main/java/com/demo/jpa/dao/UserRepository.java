package com.demo.jpa.dao;

import com.demo.jpa.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Person, Integer> {
}
