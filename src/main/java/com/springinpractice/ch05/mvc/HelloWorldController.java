/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch05.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Joshua White
 */
@Controller
public class HelloWorldController {

	@RequestMapping("/helloWorldControllerTest")
	public String showTestPage() {	
		return "helloWorld";
	}
}
