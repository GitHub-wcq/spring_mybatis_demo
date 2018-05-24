package com.wcq.datasourcewr.service;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wcq.datasourcewr.entity.Student;
import com.wcq.datasourcewr.mapper.StudentMapper;
import com.wcq.datasourcewr.util.DBContextHolder;


@Service("studentService")
public class StudentService {
	
	@Resource
	private StudentMapper studentMapper;
	
	public String getById(Integer id) {
		DBContextHolder.setDbType(DBContextHolder.DB_TYPE_R);
		return studentMapper.getById(id).toString();
	}
	
	public Long getCount() {
		DBContextHolder.setDbType(DBContextHolder.DB_TYPE_R);
		return studentMapper.count();
	}
	
	public Integer saveStatudent(String name,Integer age) {
		Student entity = new Student();
		entity.setName(name);
		entity.setAge(age);
		studentMapper.insert(entity);
		return entity.getId();
	}

}
