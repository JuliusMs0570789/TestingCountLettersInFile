package com.jetbrains;

import java.io.*;

class Three {


    public int countLetters(Reader reader, char testValue) throws IOException {
        int[] a = new int[100000];
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        int c = 0;
        while ((c = reader.read()) != -1)         //Read char by Char
        {
            char character = (char) c;
            char ch = Character.toUpperCase(character);
            a[ch]++;
        }

        int test = a[Character.toUpperCase(testValue)];

        //new file for the frequencies
        String pathname = Path.FREQUENCY;
        File f = new Two().createFile(pathname);

        FileWriter fw = new FileWriter(f);
        BufferedWriter br = new BufferedWriter(fw);

        for (int i = 65; i < 91; i++) {
            br.write("" + alphabet[i - 65] + ": " + new Six().printStars(a[i]) + "\n");
        }
        br.close();
        reader.close();

        new Five().mostFrequent(a, alphabet);

        return test;
    }
}


