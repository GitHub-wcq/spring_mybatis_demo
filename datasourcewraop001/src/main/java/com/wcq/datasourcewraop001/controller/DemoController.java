package com.wcq.datasourcewraop001.controller;


import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wcq.datasourcewraop001.service.StudentService;

@RestController
@RequestMapping("/student")
public class DemoController {
	
	@Resource(name = "studentService")
	private StudentService studentService;
	@RequestMapping(value = "/getById",method = RequestMethod.GET)
	public String getById(Integer id) {
		return studentService.getById(id);
	}
	@RequestMapping(value = "/getCount",method = RequestMethod.GET)
	public String getCount() {
		return studentService.getCount().toString();
	}
	
	@RequestMapping(value = "/saveStatudent",method = {RequestMethod.GET,RequestMethod.POST})
	public String saveStatudent(String name,Integer age) {
		return studentService.saveStatudent(name, age).toString();
	}

}
