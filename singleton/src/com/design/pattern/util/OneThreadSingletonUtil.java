package com.design.pattern.util;

import java.io.Serializable;

public class OneThreadSingletonUtil implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3956969590294598669L;

	public OneThreadSingletonUtil() {
		
	}
	
	private static class SingletonHelper {
		private static final OneThreadSingletonUtil instance = new OneThreadSingletonUtil();
	}
	
	public OneThreadSingletonUtil getInstance() {
		return SingletonHelper.instance;
	}
}

