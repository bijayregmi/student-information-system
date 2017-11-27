package com.ambonare.student.service;

import com.ambonare.student.domain.StudentInfo;

public interface StudentInfoService {

	public StudentInfo getStudentInfo(int id);

	public StudentInfo saveStudentInfo(StudentInfo studentInfo);

}
