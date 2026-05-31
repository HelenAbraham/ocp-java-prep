package com.javaskool.javahub.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @Test
    void shouldReturnTrueForPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("racecar"));
    }

    @Test
    void shouldReturnFalseForNonPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
    }

    @Test
    void shouldReturnTrueForSingleLetter() {
        assertTrue(PalindromeChecker.isPalindrome("a"));
    }
}
