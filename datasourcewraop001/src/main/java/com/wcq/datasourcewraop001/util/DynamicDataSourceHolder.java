package com.wcq.datasourcewraop001.util;

public class DynamicDataSourceHolder {
	
	public static final ThreadLocal<String> holder = new ThreadLocal<String>();
	
	public static void setDataSource(String name) {
		holder.set(name);
	}
	
	public static String getDataSource() {
		return holder.get();
	}

}
