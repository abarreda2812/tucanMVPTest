package com.tucan.mvp.processors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tucan.mvp.model.Game;

/**
 * Test the file processor with the files of resources.
 * @author a.barreda.bonis
 *
 */
public class FileProcessorTest {

	/**
	 * Resource example file.
	 */
    private String filePath1 = "src/test/resources/files/basketball.txt";

    private FileProcessor fileProcessor;

    @BeforeEach
    public void setUp() {
        fileProcessor = new FileProcessor();
    }

    @Test
    public void readFile() throws FileNotFoundException {
        List<String> list = new ArrayList<String>();
        list.add(filePath1);
        List<Game> result = fileProcessor.extractGames(list);
        assertEquals(1, result.size());
    }

    @Test
    public void readFileNotFound() throws FileNotFoundException {
        List<String> list = new ArrayList<String>();
        list.add("111");
        assertThrows(FileNotFoundException.class, () -> fileProcessor.extractGames(list));
    }

}
