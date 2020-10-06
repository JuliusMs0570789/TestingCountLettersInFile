package com.jetbrains;

class Five {
    public char mostFrequent(int[] a, char[] alphabet) {
        int mostFrequent = 0;
        char letter = 'a';
        for (int i = 0; i < a.length; i++) {
            if (a[i] > mostFrequent && i >= 65 && i < 91) {
                mostFrequent = a[i];
                letter = alphabet[i-65];
            }
            a[i] = 0;
        }
        System.out.println("The most frequent letter is "+ letter);
        return letter;
    }
}
