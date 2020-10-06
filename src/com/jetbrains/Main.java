package com.jetbrains;


import java.io.*;
import java.nio.file.Paths;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) throws IOException {

        //Pre Lab P2
        new PreTwo().MakeItBig('g');
        new PreTwo().MakeItSmall('g');


        //Pre Lab P1
        char array[] = new char[70];

        array['A'] = '1';
        array['B'] = '2';
        array['C'] = '3';

        for (int i = 65; i < 68; i++) {
            System.out.println(array[i]);
        }

        //Assignment Aufgabe 2
        File file = new Two().createFile(Path.FILE);
        new Two().writeIntegerToFile(21);
        new Two().writeIntToFile(13);
        new Two().writeStringToFile("Hello");

        //Assignment Aufgabe 1
        System.out.println(new One()
                .nextCharacter(Paths.get(Path.FILE), 3));

        //Assignment Aufgabe 3
        BufferedReader reader = new BufferedReader(new FileReader(Path.FILE));
        new Three().countLetters(reader, 'A');

        //Assignment Aufgabe 7
        reader = new BufferedReader(new FileReader(Path.NEWS));
        new Three().countLetters(reader, 'A');
    }
}

