/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch05.service;

import com.springinpractice.ch05.domain.Player;
import com.springinpractice.ch05.domain.search.PlayerSearchCriteria;
import com.springinpractice.ch05.form.AccountForm;

/**
 * @author Joshua White
 */
public interface PlayerService {
	
	public Player findExistingPlayer(PlayerSearchCriteria criteria);
				
	public String createNewAccount(AccountForm newAccountForm);
}
