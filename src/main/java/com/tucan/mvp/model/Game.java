package com.tucan.mvp.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
/**
 * Models a game.
 * @author a.barreda.bonis
 *
 */
public class Game {

    private SportEnum sport;
    private List<Player> playerList;
    

    public Game(String gameName) {
        playerList = new ArrayList<Player>();
        sport = gameName.equals(SportEnum.BASKETBALL.name()) ? SportEnum.BASKETBALL : SportEnum.HANDBALL;
    }

    /**
     * Add player stats from the positions of the file.
     * @param sport Sport of game.
     * @param fields Text from file.
     * @return the player.
     */
    public Player addPlayerStats(SportEnum sport, String[] fields) {
        String nickName = fields[1];
        String team = fields[3];
        Player player = new Player(nickName, team);
        player.addStats(sport, fields);
        playerList.add(player);
        return player;
    }

    /**
     * Update the winner counter for the player that played the game with the winnerTeam
     * @param winnerTeam
     */
    public void updateWinner(String winnerTeam) {
        for (Player player: playerList) {
            if(player.getTeam().equals(winnerTeam)) {
                player.increaseWinnerCounter();
            }
        }
    }
}
