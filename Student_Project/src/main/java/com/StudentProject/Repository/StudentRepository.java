package com.StudentProject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.StudentProject.Model.StudentModel;

@Repository
public interface StudentRepository extends CrudRepository<StudentModel,Integer>{

}
