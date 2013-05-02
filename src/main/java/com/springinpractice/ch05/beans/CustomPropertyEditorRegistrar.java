/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch05.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;

/**
 * @author Joshua White
 */
public class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar {

	@Override
	public void registerCustomEditors(PropertyEditorRegistry propertyEditorRegistry) {
		SimpleDateFormat dateWithFormatting = new SimpleDateFormat("MM/dd/yyyy");
		propertyEditorRegistry.registerCustomEditor(Date.class, new CustomDateEditor(dateWithFormatting, true, 10));
		
		SimpleDateFormat dateWithoutFormatting = new SimpleDateFormat("MMddyyyy");
		propertyEditorRegistry.registerCustomEditor(Date.class, new CustomDateEditor(dateWithoutFormatting, true, 8));		
	}

}
