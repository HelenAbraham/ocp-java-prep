package com.javaskool.javahub.solutions.basics;

public class ReverseStringSolution {

    public static String reverse(String input) {

        StringBuilder result = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            result.append(input.charAt(i));
        }

        return result.toString();
    }
}