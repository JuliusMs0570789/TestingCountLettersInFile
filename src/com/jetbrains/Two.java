package com.jetbrains;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class Two {

    //Assignment Aufgabe 2
    public File createFile(String pathname) throws IOException {
        File file = new File(pathname);
        if (file.createNewFile()) {
            System.out.println("File Created in Project root directory");
        } else System.out.println("File already exists in the project root directory");
        return file;
    }

    public void writeStringToFile(String s) throws IOException {
        Files.write(Paths.get(Path.FILE), s.getBytes());
    }

    public void writeIntegerToFile(Integer integer) throws IOException {
        String s = integer.toString();
        Files.write(Paths.get(Path.FILE), s.getBytes());
    }

    public void writeIntToFile(int i) throws IOException {
        String str = "" + i;
        Files.write(Paths.get(Path.FILE), str.getBytes());
    }
}
