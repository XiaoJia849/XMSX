package com.demo.dao;

import com.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface QueryDao {
    List<Student> queryAll();
}
