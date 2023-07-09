package com.sudhir.crud.Controller;


import com.sudhir.crud.model.Student;
import com.sudhir.crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Student> findStudentById(@PathVariable("id") Integer id) {
         Student s = studentRepository.findById(id).get();
         return new ResponseEntity<>(s, HttpStatus.OK);
    }

    @PostMapping(value = "/register")
    public ResponseEntity<Integer> saveStudent(@RequestBody Student student) {
        System.out.println("POST");

        Integer id = studentRepository.save(student).getId();

        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
