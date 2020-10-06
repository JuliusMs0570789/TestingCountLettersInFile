package com.jetbrains;

class Six {
    public String printStars(int total) {
        String allStars = "";
        for (int i = 0; i < total; i++) {
            allStars = allStars + "*";
        }
        return allStars;
    }
}
