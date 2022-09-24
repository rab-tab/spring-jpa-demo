package com.demo.jpa;

import com.demo.jpa.school.entity.Student;
import com.demo.jpa.school.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {


    @Autowired
    StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder().emailId("student1@gmail.com").
                firstName("Student1 first name").
                lastName("Student1 last name").guardianName("Nikhil").guardianEmail("guardian1@gmail.com").build();
        studentRepository.save(student);
    }

}
