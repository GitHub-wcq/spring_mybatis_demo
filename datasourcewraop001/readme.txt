

自定义AOP，通过AOP和自定义注解的方式切换数据源


===========================自定义注解======================================

package com.wcq.datasourcewraop001.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DataSource {
	String value();
}

=============================使用注解=======================================
	@DataSource("read")
	public String getById(Integer id) {
		return studentMapper.getById(id).toString();
	}