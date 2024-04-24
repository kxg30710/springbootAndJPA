package com.iluv2code.demo.entity;

import org.springframework.web.bind.annotation.RestController;


public class Student {

private String firstName;
private String lastName;

    public Student() {
    }

    public Student(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
