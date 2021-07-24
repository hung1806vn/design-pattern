package com.design.pattern.util;

public class MultiThreadSingletonUtil {
	private static volatile MultiThreadSingletonUtil instance ;
	
	public MultiThreadSingletonUtil() {
		
	}
	
	public MultiThreadSingletonUtil getInstance() {
		if(instance==null) {
			synchronized (MultiThreadSingletonUtil.class) {
				if(instance==null) 
					instance = new MultiThreadSingletonUtil();
			}
		}
		return instance;
	}
}
