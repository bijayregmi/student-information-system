package com.ambonare.student.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ambonare.student.domain.Student;

@Repository
public interface StudentDao extends CrudRepository<Student, Integer> {

//	Page<Student> findAll(Pageable pageRequest);
	
	Student findById(int id);
	
	List<Student> findBylastName(String lastName);


}
