package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;

import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class RepositoryDAOImpl implements StudentDAO{

    EntityManager entityManager;

    @Autowired
    public RepositoryDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(Student student) {
        entityManager.merge(student);

    }

    @Override
    public Student findById(int id) {
        Student student = entityManager.find(Student.class, id);
        return student;
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> theQuery=entityManager.createQuery("From Student order by lastName desc",Student.class);
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> query = entityManager.createQuery("From Student where lastName=:theData", Student.class);
    query.setParameter("theData",lastName);
    return query.getResultList();
    }

    @Override
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    public void deleteById(int id) {
        Student student = entityManager.find(Student.class,id);
        entityManager.remove(student);
    }

    @Override
    public int deleteAll() {
        int deleteFromStudent = entityManager.createQuery("DELETE FROM Student").executeUpdate();
        return deleteFromStudent;
    }


}
