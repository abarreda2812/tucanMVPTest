package com.tucan.mvp.services;

import lombok.Getter;
import lombok.Setter;

/**
 * Sport implementation with common methods.
 * @author a.barreda.bonis
 *
 */
@Getter
@Setter
public abstract class Sport implements SportInterface {

    /**
     * The bonus determinated by the specification.
     */
	public static final int BONUS_WINNER_TEAM = 10;

    private String position;
    /**
     * Number of winning games.
     */
    private int numberWinningGames;
    
    
    public Sport(String[] stats) {
        numberWinningGames = 0;
        setPosition(stats[4]);
    }
    
    /**
     * Increase the winner games.
     */
    public int increaseWinnerGamesCounter() {
        return this.numberWinningGames++;
    }

}
