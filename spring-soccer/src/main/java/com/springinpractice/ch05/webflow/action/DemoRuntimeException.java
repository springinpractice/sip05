package com.springinpractice.ch05.webflow.action;

public class DemoRuntimeException extends RuntimeException {	
	private static final long serialVersionUID = 1L;

	public DemoRuntimeException() {
		super();
	}
	
	public DemoRuntimeException(String msg) {
		super(msg);
	}
	
}
