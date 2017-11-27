package com.ambonare.student.service;

import java.util.List;

import com.ambonare.student.domain.Student;

public interface StudentService {
//	public Page<Student> getStudents(Pageable pageRequest);
	
	public List<Student> getStudents();

	public Student getStudent(int id);

	public Student saveStudent(Student student);
	
	public List<Student> findStudent(String lastName);
	

}
