package com.argus.DemoApp.dao;

import com.argus.DemoApp.entity.Student;

public interface StudentDAO {
    void save(Student student);

    Student findById(Integer id);

    void update(Student student);

    void delete(Integer id);
}
