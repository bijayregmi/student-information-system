package com.ambonare.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ambonare.student.dao.StudentInfoDao;
import com.ambonare.student.domain.StudentInfo;

@Service
@Transactional
public class StudentInfoServiceImp implements StudentInfoService {

	@Autowired
	StudentInfoDao studentInfoDao;

	@Override
	public StudentInfo getStudentInfo(int id) {
		// TODO Auto-generated method stub
		return studentInfoDao.findOne(id);
	}

	@Override
	public StudentInfo saveStudentInfo(StudentInfo studentInfo) {
		// TODO Auto-generated method stub
		return studentInfoDao.save(studentInfo);
	}

}
