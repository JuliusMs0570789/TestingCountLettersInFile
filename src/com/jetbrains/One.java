package com.jetbrains;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class One{

    //Assignment Aufgabe 1
    public char nextCharacter(Path path, int i) throws IOException {
        // Parameter1: Datei, die gelesen werden soll
        // Parameter2: Position ab der, der nächste Character returned werden soll
        // Exception, wenn Index out of Bounds
        String content = new String(Files.readAllBytes(path));
        char ch = content.charAt(i + 1);
        return ch;
    }
}
