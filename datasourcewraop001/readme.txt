

�Զ���AOP��ͨ��AOP���Զ���ע��ķ�ʽ�л�����Դ


===========================�Զ���ע��======================================

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

=============================ʹ��ע��=======================================
	@DataSource("read")
	public String getById(Integer id) {
		return studentMapper.getById(id).toString();
	}