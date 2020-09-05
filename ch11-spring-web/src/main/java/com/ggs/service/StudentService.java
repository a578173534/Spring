package com.ggs.service;

import com.ggs.domain.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);

    List<Student> queryStudents();
}
