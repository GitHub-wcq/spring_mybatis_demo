package com.wcq.datasourcewr.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wcq.datasourcewr.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Resource(name = "studentService")
	private StudentService studentService;
	
	@RequestMapping(value = "/getHelloDemo",method = RequestMethod.GET)
	public String getHelloDemo(String name) {
		return "hello " + name;
	}
	
	@RequestMapping(value = "/getById",method = RequestMethod.GET)
	public String getById(Integer id) {
		return studentService.getById(id);
	}
	
	@RequestMapping(value = "/getCount",method = RequestMethod.GET)
	public String getCount() {
		return studentService.getCount() + "";
	}
	@RequestMapping(value = "/saveStudent",method = RequestMethod.GET)
	public String saveStudent(String name,Integer age) {
		return studentService.saveStatudent(name, age).toString();
	}

}
