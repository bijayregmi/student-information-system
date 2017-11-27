package com.ambonare.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ambonare.student.dao.StudentDao;
import com.ambonare.student.domain.Student;

@Service
@Transactional
public class StudentServiceImp implements StudentService {

	@Autowired
	StudentDao studentDao;

	/*@Override
	public Page<Student> getStudents(Pageable pageRequest) {
		return studentDao.findAll(pageRequest);
	}*/
	
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return (List<Student>) studentDao.findAll();
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return studentDao.findById(id);
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.save(student);
	}

	@Override
	public List<Student> findStudent(String lastName) {
		// TODO Auto-generated method stub
		return studentDao.findBylastName(lastName);
	}

	

	

}
