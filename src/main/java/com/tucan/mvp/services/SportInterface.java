package com.tucan.mvp.services;

/**
 * Util interface that provides methods for determine the MVP.
 * @author a.barreda.bonis
 *
 */
public interface SportInterface {
	/**
	 * Calculates rating.
	 * @return rating calculated.
	 */
    int calculateRating();
    /**
     * Increases the winner games counter.
     * @return the winner games counter.
     */
    int increaseWinnerGamesCounter();

    /**
     * Returns the score.
     * @return the score.
     */
    int getScore();

}
