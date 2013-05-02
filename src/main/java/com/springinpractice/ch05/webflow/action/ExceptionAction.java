/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch05.webflow.action;

import org.springframework.webflow.execution.Action;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

/**
 * @author Joshua White
 */
public class ExceptionAction implements Action {

	@Override
	public Event execute(RequestContext context) {
		throw new DemoRuntimeException("Exception thrown " + "to demonstrate exception handling");
	}

}