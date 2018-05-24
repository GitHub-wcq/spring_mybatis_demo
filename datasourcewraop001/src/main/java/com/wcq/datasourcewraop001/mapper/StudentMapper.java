package com.wcq.datasourcewraop001.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.wcq.datasourcewraop001.entity.Student;

@Repository
public interface StudentMapper{

	void insert(Student entity);
	
	void update(Student entity);
	
	void delete(java.lang.Integer id);
	
	Student getById(java.lang.Integer id);

	Long count();
	
	List<Student> findPage(Map<String, Object> param);

}
