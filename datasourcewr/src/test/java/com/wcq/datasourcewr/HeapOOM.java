package com.wcq.datasourcewr;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: HeapOOM</p>  
 * Description: <pre>���ڴ��������</pre>   
 * @author wangchaoqun 
 * @date 2018��5��22��
 */
public class HeapOOM {

	static class OOMObject{
		
	}
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<>();
		while(true) {
			list.add(new OOMObject());
		}
	}
	
}
