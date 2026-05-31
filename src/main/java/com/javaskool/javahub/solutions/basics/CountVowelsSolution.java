package com.javaskool.javahub.solutions.basics;

public class CountVowelsSolution {

    public static int countVowels(String input) {

    int count = 0;

    for (int i = 0; i < input.length(); i++) {

        char currentCharacter = input.charAt(i);

        if (currentCharacter == 'a' ||
            currentCharacter == 'e' ||
            currentCharacter == 'i' ||
            currentCharacter == 'o' ||
            currentCharacter == 'u') {

            count++;
        }
    }

    return count;
}
}
