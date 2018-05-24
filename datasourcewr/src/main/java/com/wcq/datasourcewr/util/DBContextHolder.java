package com.wcq.datasourcewr.util;

public class DBContextHolder {
	
	private static ThreadLocal<String> contextHolder = new ThreadLocal<>();
	//master¶ÁÐ´
	public static final String DB_TYPE_RW = "dataSourceRW";
	//salve¶Á
	public static final String DB_TYPE_R = "dataSourceR"; 
    
    public static String getDbType() {
    	String db = contextHolder.get();
    	if(db == null) {
    		db = DB_TYPE_RW;
    	}
    	return db;
    }

    public static void setDbType(String str) { 
    	contextHolder.set(str);
    }
    public static void clearDBType() {  
        contextHolder.remove();  
    }  
    
}
