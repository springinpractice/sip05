package com.springinpractice.ch05.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;


public class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar {

	@Override
	public void registerCustomEditors(PropertyEditorRegistry propertyEditorRegistry) {
		SimpleDateFormat dateWithFormatting = new SimpleDateFormat("MM/dd/yyyy");
		propertyEditorRegistry.registerCustomEditor(Date.class, new CustomDateEditor(dateWithFormatting, true, 10));
		
		SimpleDateFormat dateWithoutFormatting = new SimpleDateFormat("MMddyyyy");
		propertyEditorRegistry.registerCustomEditor(Date.class, new CustomDateEditor(dateWithoutFormatting, true, 8));		
	}

}
