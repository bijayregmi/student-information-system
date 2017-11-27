package com.ambonare.student.dao;

import org.springframework.data.repository.CrudRepository;

import com.ambonare.student.domain.StudentInfo;

public interface StudentInfoDao extends CrudRepository<StudentInfo, Integer> {

}
