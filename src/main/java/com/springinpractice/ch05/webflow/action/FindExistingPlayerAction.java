/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch05.webflow.action;

import org.springframework.webflow.execution.Action;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;
import com.springinpractice.ch05.domain.Player;
import com.springinpractice.ch05.domain.search.PlayerSearchCriteria;
import com.springinpractice.ch05.service.PlayerService;

/**
 * @author Joshua White
 */
public class FindExistingPlayerAction implements Action {
	private PlayerService playerService;

	public void setPlayerService(PlayerService playerService) {
		this.playerService = playerService;
	}

	@Override
	public Event execute(RequestContext context) {
		Event event = null;
		PlayerSearchCriteria criteria = (PlayerSearchCriteria) context.getFlowScope().get("playerSearchCriteria");
		if (criteria != null) {
			Player player = playerService.findExistingPlayer(criteria);
			context.getFlowScope().put("player", player);

			event = new Event(this, "success");
		} else {
			event = new Event(this, "error");
		}

		return event;
	}

}
