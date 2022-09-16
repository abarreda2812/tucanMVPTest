package com.tucan.mvp.processors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tucan.mvp.exception.FileWithBugException;
import com.tucan.mvp.model.PlayerOverall;

/**
 * Test the ratings of the two sample sports files.
 * @author a.barreda.bonis
 *
 */
public class TournamentTest {

    private Tournament tournament;
    private List<String> filesWithNoErrors;
    
    private String filePath1 = "src/test/resources/files/basketball.txt";
    private String filePath2 = "src/test/resources/files/handball.txt";

    @BeforeEach
    public void setUp() {
        tournament = new Tournament();
        filesWithNoErrors = new ArrayList<String>();
    }

    @Test
    public void calculateMvpTournament() throws FileWithBugException, FileNotFoundException {
    	filesWithNoErrors.add(filePath1);
    	filesWithNoErrors.add(filePath2);

        PlayerOverall player = tournament.calculateMvp(filesWithNoErrors);

        assertNotNull(player); 
        assertEquals(player.getNickName(), "nick3");
        assertEquals(player.getRatingPoints(), 52);
    }

}
