package com.tucan.mvp.model;


import com.tucan.mvp.services.SportInterface;
import com.tucan.mvp.services.impl.BasketballPlayRating;
import com.tucan.mvp.services.impl.HandballPlayRating;

import lombok.Getter;
import lombok.Setter;

/**
 * Models the stores the player stats for an specific game and sport
 * @author a.barreda.bonis
 */
@Getter
@Setter
public class Player {

	/**
	 * The name 2nd position of file.
	 */
    private String nickName;
    /**
     * @see SportInterface
     */
    private SportInterface sport;
    /**
	 * The team 4th position of file.
	 */
    private String team;
    

    public Player(String nickName, String team) {
        this.nickName = nickName;
        setTeam(team);
    }

    public int calculateRating() {
        return sport.calculateRating();
    }

    public void addStats(SportEnum sportEnum, String[] fields) {
        if (sportEnum.equals(SportEnum.BASKETBALL)) {
            sport = new BasketballPlayRating(fields);
        } else {
            sport = new HandballPlayRating(fields);
        }
    }

    public int getPointsScore() {
        return sport.getScore();
    }
    
    public void increaseWinnerCounter() {
        sport.increaseWinnerGamesCounter();
    }

}
