package com.argus.DemoApp.dao;

import com.argus.DemoApp.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDAoImpl implements StudentDAO{

    //define field for entity manager
    private EntityManager entityManager;

    //inject entity manager using constructor
    @Autowired
    public StudentDAoImpl(EntityManager entManager){
//        entityManager = entManager;
        this.entityManager = entManager;
    }

    //implement save method
    @Override
    @Transactional
    //automatically begin and end a transaction since we are storing and updating database
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class , id);
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Student std = entityManager.find(Student.class , id);
        entityManager.remove(std);
    }
}
