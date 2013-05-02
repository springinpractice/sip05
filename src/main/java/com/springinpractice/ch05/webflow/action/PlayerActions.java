/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch05.webflow.action;

import org.springframework.webflow.action.MultiAction;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;
import com.springinpractice.ch05.domain.Player;
import com.springinpractice.ch05.domain.search.PlayerSearchCriteria;
import com.springinpractice.ch05.service.PlayerService;

/**
 * @author Joshua White
 */
public class PlayerActions extends MultiAction {

	private PlayerService playerService;

	public void setPlayerService(PlayerService playerService) {
		this.playerService = playerService;
	}

	public Event findExistingPlayer(RequestContext context) {
		PlayerSearchCriteria criteria = (PlayerSearchCriteria) context.getFlowScope().get("playerSearchCriteria");
		if (criteria != null) {
			Player player = playerService.findExistingPlayer(criteria);
			context.getFlowScope().put("player", player);

			return success();
		} else {
			return error();
		}
	}

}