/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch05.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Joshua White
 */
public class Guardian implements Serializable {
	private static final long serialVersionUID = 1L;
		
	protected String firstName;
	protected String lastName;
	protected String homePhone;
	protected String address1;	
	protected String address2;
	protected String city;		
	protected String state;
	protected String zip;
	protected String email;
	protected String password;	
	protected List<Player> players = new ArrayList<Player>();
		
	public Guardian() {}
	
	public Guardian(String firstName, String lastName, String homePhone,
			String address1, String address2, String city, String state,
			String zip, String email, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.homePhone = homePhone;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.email = email;
		this.password = password;
	}

	@NotEmpty
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@NotEmpty
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@NotEmpty
	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	@NotEmpty
	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@NotEmpty
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@NotEmpty
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@NotEmpty
	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@NotEmpty
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@NotEmpty
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	/*
	 * Use the email as the username
	 */	
	public String getUsername() {
		return email;
	}
	
	public void addPlayer(Player player) {
		if (player != null) {
			players.add(player);
			player.setGuardian(this);
		}
	}
	
	public List<Player> getPlayers() {
		return Collections.unmodifiableList(players);
	}	

	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
		.append("username", email)
		.append("firstName", firstName)
		.append("lastName", lastName)
		.append("address1", address1)
		.append("address2", address2)
		.append("city", city)
		.append("state", state)
		.append("zip", zip)
		.append("email", email)
		.append("homePhone", homePhone)
		.toString();		
	}	

}
