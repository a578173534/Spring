package com.ggs.dao;

import com.ggs.domain.Student;

import java.util.List;

public interface OrderDao {

    int insertStudent(Student student);

    List<Student> selectStudents();
}
