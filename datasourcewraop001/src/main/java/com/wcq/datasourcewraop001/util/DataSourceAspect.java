package com.wcq.datasourcewraop001.util;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * <p>Title: DataSourceAspect</p>  
 * Description: <pre>切面类</pre>   
 * @author wangchaoqun 
 * @date 2018年5月22日
 */
public class DataSourceAspect {
	

	public void before(JoinPoint point) {
		System.out.println("========before========");
		Object target = point.getTarget();
		System.out.println(target.toString());
		String method = point.getSignature().getName();
		System.out.println(method);
		Class<?> classz = target.getClass();
		Class<?>[] parameterTypes = ((MethodSignature)point.getSignature()).getMethod().getParameterTypes();
		try {
			Method m = classz.getMethod(method, parameterTypes);
			System.out.println(m.getName());
			if(m != null && m.isAnnotationPresent(DataSource.class)) {
				DataSource data = m.getAnnotation(DataSource.class);
				DynamicDataSourceHolder.setDataSource(data.value());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
