package com.learn.dao;
import com.learn.model.Student;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DbUtility extends CrudRepository<Student,Integer>{

}
