package com.ambonare.student.sampledata;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.ambonare.student.domain.Course;
import com.ambonare.student.domain.Semester;
import com.ambonare.student.domain.Student;
import com.ambonare.student.domain.StudentInfo;
import com.ambonare.student.service.StudentInfoService;

@Component
public class MySampleData implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	StudentInfoService studentInfoService;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		if (event.getApplicationContext().getParent() == null) {
			List<Course> courses = new ArrayList<Course>();
			courses.add(new Course("CS525"));
			courses.add(new Course("CS540"));
			courses.add(new Course("CS475"));

			List<Course> courses1 = new ArrayList<Course>();
			courses1.add(new Course("CS500"));
			courses1.add(new Course("CS501"));
			courses.add(new Course("CS525"));
			courses.add(new Course("CS540"));
			
			List<Course> courses2 = new ArrayList<Course>();
			courses2.add(new Course("CS420"));
			courses2.add(new Course("CS501"));
			
			List<Course> courses3 = new ArrayList<Course>();
			courses3.add(new Course("CS500"));
			courses3.add(new Course("CS501"));
			courses.add(new Course("CS525"));
			
			
			List<Course> courses4 = new ArrayList<Course>();
			courses4.add(new Course("CS500"));
			courses4.add(new Course("CS501"));
			courses.add(new Course("CS540"));

			StudentInfo s = new StudentInfo(new Student("John", "Smith"), Semester.FIFTH, courses);
			StudentInfo s1 = new StudentInfo(new Student("Joe", "Panday"), Semester.THIRD, courses);
			StudentInfo s2 = new StudentInfo(new Student("Bob", "Smith"), Semester.FIRST, courses1);
			StudentInfo s3 = new StudentInfo(new Student("Mike", "Johnes"), Semester.EIGHTH, courses1);
			StudentInfo s4 = new StudentInfo(new Student("James", "Smith"), Semester.FIFTH, courses2);
			StudentInfo s5 = new StudentInfo(new Student("Haris", "Walker"), Semester.THIRD, courses2);
			StudentInfo s6 = new StudentInfo(new Student("Robinson", "Levi"), Semester.EIGHTH, courses3);
			StudentInfo s7 = new StudentInfo(new Student("Steve", "Nolle"), Semester.EIGHTH, courses3);
			StudentInfo s8 = new StudentInfo(new Student("Bruce", "Lester"), Semester.FIFTH, courses4);
			StudentInfo s9 = new StudentInfo(new Student("John", "Doe"), Semester.THIRD, courses4);
			StudentInfo s10 = new StudentInfo(new Student("Paul", "Corroza"), Semester.FIRST, courses1);
			StudentInfo s11 = new StudentInfo(new Student("Najeeb", "Najeeb"), Semester.EIGHTH, courses4);
			StudentInfo s12 = new StudentInfo(new Student("Payman", "Lee"), Semester.FIFTH, courses2);
			StudentInfo s13 = new StudentInfo(new Student("Aleen", "Baker"), Semester.SECOND, courses3);
			StudentInfo s14 = new StudentInfo(new Student("Nelson", "Parker"), Semester.EIGHTH, courses1);
			StudentInfo s15 = new StudentInfo(new Student("Scoot", "Hills"), Semester.THIRD, courses2);

			studentInfoService.saveStudentInfo(s);
			studentInfoService.saveStudentInfo(s1);
			studentInfoService.saveStudentInfo(s2);
			studentInfoService.saveStudentInfo(s3);
			studentInfoService.saveStudentInfo(s4);
			studentInfoService.saveStudentInfo(s5);
			studentInfoService.saveStudentInfo(s6);
			studentInfoService.saveStudentInfo(s7);
			studentInfoService.saveStudentInfo(s8);
			studentInfoService.saveStudentInfo(s9);
			studentInfoService.saveStudentInfo(s10);
			studentInfoService.saveStudentInfo(s11);
			studentInfoService.saveStudentInfo(s12);
			studentInfoService.saveStudentInfo(s13);
			studentInfoService.saveStudentInfo(s14);
			studentInfoService.saveStudentInfo(s15);
		}
	}
}