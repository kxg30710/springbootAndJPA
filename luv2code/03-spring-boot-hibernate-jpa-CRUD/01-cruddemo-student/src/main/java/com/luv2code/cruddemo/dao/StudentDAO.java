package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    //To insert a row
    public void save(Student student);

    //Retrieve a student by ID
    public Student findById(int id);

    //Find all
    public List<Student> findAll();

    //Retrieve a student by LastName
    public List<Student> findByLastName(String lastName);

    //Update
    public void update(Student student);

    //Delete
    public void deleteById(int id);

    //Delete All
    public int deleteAll();
}
