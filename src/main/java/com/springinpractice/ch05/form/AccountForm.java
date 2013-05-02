/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch05.form;

import java.io.Serializable;

import javax.validation.Valid;
import org.hibernate.validator.constraints.NotEmpty;
import com.springinpractice.ch05.domain.Guardian;
import com.springinpractice.ch05.domain.Player;

/**
 * @author Joshua White
 */
public class AccountForm implements Serializable {
	private static final long serialVersionUID = 1L;
	
	protected Guardian guardian = new Guardian();		
	protected Player child = new Player();		
	protected String confirmPassword;	
	protected String confirmEmail;
	
	public AccountForm() {}

	@Valid
	public Guardian getGuardian() {
		return guardian;
	}

	public void setGuardian(Guardian guardian) {
		this.guardian = guardian;
	}

	@Valid
	public Player getChild() {
		return child;
	}

	public void setChild(Player child) {
		this.child = child;
	}
	
	@NotEmpty
	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@NotEmpty
	public String getConfirmEmail() {
		return confirmEmail;
	}

	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}
	
}
