package com.springinpractice.ch05.service;

import com.springinpractice.ch05.domain.Player;
import com.springinpractice.ch05.domain.search.PlayerSearchCriteria;
import com.springinpractice.ch05.form.AccountForm;

public interface PlayerService {
	
	public Player findExistingPlayer(PlayerSearchCriteria criteria);
				
	public String createNewAccount(AccountForm newAccountForm);
}
