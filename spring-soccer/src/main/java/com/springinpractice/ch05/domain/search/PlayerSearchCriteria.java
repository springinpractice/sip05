package com.springinpractice.ch05.domain.search;

import java.io.Serializable;
import java.util.Date;

public class PlayerSearchCriteria  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	protected String firstName;
	protected String lastName;
	protected Date birthDate;
	protected String homePhone;
	
	public PlayerSearchCriteria() {}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	
	

}
