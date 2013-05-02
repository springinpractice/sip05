/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch05.webflow.action;

/**
 * @author Joshua White
 */
public class DemoRuntimeException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DemoRuntimeException() {
		super();
	}

	public DemoRuntimeException(String msg) {
		super(msg);
	}

}
