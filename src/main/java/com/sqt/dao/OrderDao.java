package com.sqt.dao;

import com.sqt.domain.Student;

import java.util.List;

public interface OrderDao {

    int insertStudent(Student student);
    List<Student> selectStudents();

}
