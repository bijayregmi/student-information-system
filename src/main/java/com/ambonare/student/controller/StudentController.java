package com.ambonare.student.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ambonare.student.domain.Student;
import com.ambonare.student.domain.StudentInfo;
import com.ambonare.student.service.StudentInfoService;
import com.ambonare.student.service.StudentService;

/**
 * Handles requests for the application student page.
 */
@Controller
public class StudentController {

	@Autowired
	StudentService studentService;

	@Autowired
	StudentInfoService studentInfoService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "students";
	}

	@RequestMapping(value = "/editStudent/{id}", method = RequestMethod.GET)
	public String editStudentView(@PathVariable int id, Model model) {
		Student student = studentService.getStudent(id);
		model.addAttribute("student", student);
		return "editstudent";
	}

	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
	public String getStudentView(@PathVariable int id, Model model) {
		StudentInfo studentInfo = studentInfoService.getStudentInfo(id);
		model.addAttribute("studentInfo", studentInfo);
		return "studentinfo";
	}

	/*
	 * @RequestMapping(value = "/students", method = RequestMethod.GET)
	 * 
	 * @ResponseBody public Page<Student> getStudents(@RequestParam("page") int
	 * page, @RequestParam("size") int size) { Page<Student> students =
	 * studentService.getStudents(new PageRequest(page, size)); return students;
	 * }
	 */

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	@ResponseBody
	public List<Student> getStudents() {
		List<Student> students = studentService.getStudents();
		return students;
	}

	@RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Student getStudent(@PathVariable int id) {
		Student student = studentService.getStudent(id);
		return student;
	}

	@RequestMapping(value = "/students", method = RequestMethod.PUT)
	@ResponseBody
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	@RequestMapping(value = "/students/search/{lastName}", method = RequestMethod.GET)
	@ResponseBody
	public List<Student> getStudentByLastName(@PathVariable String lastName) {

		List<Student> students = studentService.findStudent(lastName);
		return students;
	}
}
