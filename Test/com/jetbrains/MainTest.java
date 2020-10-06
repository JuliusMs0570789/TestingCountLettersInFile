package com.jetbrains;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void countTest() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(Path.FILE));
        count(reader);
        reader.close();
    }

    public void count(Reader reader) throws IOException {
        assertEquals(0, new Three().countLetters(reader, 'A'));
    }
}