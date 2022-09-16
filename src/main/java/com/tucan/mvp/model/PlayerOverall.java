package com.tucan.mvp.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Models player overall.
 * @author a.barreda.bonis
 *
 */
@Getter
@Setter
public class PlayerOverall {
	
	/**
	 * Player name.
	 */
    private final String nickName;
    /**
	 * Player points.
	 */
    private int ratingPoints;

    public PlayerOverall(Player player) {
        this.nickName = player.getNickName();
        this.ratingPoints = player.calculateRating();
    }

    public PlayerOverall mergeStats(Player player2) {
        ratingPoints += player2.calculateRating();
        return this;
    }

}
