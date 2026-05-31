package com.javaskool.javahub.solutions.basics;

public class PalindromeCheckerSolution {

    public static boolean isPalindrome(String input) {
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        if (reversed.toString().equals(input)) {
            return true;
        }

        return false;
    }
}
