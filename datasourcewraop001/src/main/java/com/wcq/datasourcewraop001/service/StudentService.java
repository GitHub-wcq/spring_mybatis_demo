package com.wcq.datasourcewraop001.service;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wcq.datasourcewraop001.entity.Student;
import com.wcq.datasourcewraop001.mapper.StudentMapper;
import com.wcq.datasourcewraop001.util.DataSource;


@Service("studentService")
public class StudentService {
	
	@Resource
	private StudentMapper studentMapper;
	
	@DataSource("read")
	public String getById(Integer id) {
		return studentMapper.getById(id).toString();
	}
	@DataSource("read")
	public Long getCount() {
		return studentMapper.count();
	}
	@DataSource("write")
	public Integer saveStatudent(String name,Integer age) {
		Student entity = new Student();
		entity.setName(name);
		entity.setAge(age);
		studentMapper.insert(entity);
		return entity.getId();
	}

}
