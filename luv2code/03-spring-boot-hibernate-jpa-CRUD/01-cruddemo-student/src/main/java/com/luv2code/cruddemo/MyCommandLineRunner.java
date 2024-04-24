package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.RepositoryDAOImpl;
import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Autowired
    RepositoryDAOImpl repositoryDAO;
    @Override
    public void run(String... args) throws Exception {
       // repositoryDAO.save(new Student("Kavitha", "Gunasekaran", "k@gmail.com"));
       // repositoryDAO.save(new Student("Ellen", "Andy", "k1@gmail.com"));
      //  repositoryDAO.save(new Student("John", "Jake", "k2@gmail.com"));
      //  repositoryDAO.save(new Student("Lensy", "Lauren", "k3@gmail.com"));

       // List<Student> student_list = repositoryDAO.findAll();
      /*  List<Student> student_list = repositoryDAO.findByLastName("Gunasekaran");
       for(Student student:student_list){
           System.out.println(student);*/

      /*  Student studebtById = repositoryDAO.findById(3000);
        studebtById.setLastName("G");
        repositoryDAO.update(studebtById);*/

       // repositoryDAO.deleteById(3000);

        int i = repositoryDAO.deleteAll();
        System.out.println("No of Students deleted" + i);
    }

    }

