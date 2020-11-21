package com.demo.service;

import com.demo.dao.QueryDao;
import com.demo.model.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class QueryService {
    @Resource
    QueryDao queryDao;
    public int getIdSum(){
        List<Student> students = queryDao.queryAll();
        int sum=0;
        for(Student student:students){
            sum=sum+student.getId();
        }
        return sum;
    }
}
