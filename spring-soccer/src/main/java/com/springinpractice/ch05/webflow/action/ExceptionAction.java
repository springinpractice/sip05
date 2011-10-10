package com.springinpractice.ch05.webflow.action;

import org.springframework.webflow.execution.Action;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

public class ExceptionAction implements Action {

  @Override
  public Event execute(RequestContext context) {
	  throw new DemoRuntimeException("Exception thrown " +
	  		"to demonstrate exception handling");
  }

}