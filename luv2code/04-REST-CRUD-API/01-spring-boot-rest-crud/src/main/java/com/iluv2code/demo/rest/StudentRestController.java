package com.iluv2code.demo.rest;

import com.iluv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
private List<Student> studentList;

@PostConstruct
public void loadData(){
    studentList = new ArrayList<>();
    studentList.add(new Student("Kavitha", "Gunasekaran"));
    studentList.add(new Student("Vasanth", "Arul"));
    studentList.add(new Student("Chikku", "Vasee"));
}

    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentList;
    }

    @GetMapping("/students/{studentID}")
    public Student getStudnetById(@PathVariable int studentID){
    return studentList.get(studentID);
    }
}
