package com.javaskool.javahub.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountVowelsTest {

    @Test
    void shouldCountAllVowels() {
        assertEquals(5, CountVowels.countVowels("education"));
    }

    @Test
    void shouldCountSomeVowels() {
        assertEquals(2, CountVowels.countVowels("hello"));
    }

    @Test
    void shouldReturnZeroWhenNoVowelsExist() {
        assertEquals(0, CountVowels.countVowels("rhythm"));
    }

    @Test
    void shouldWorkWithSingleLetter() {
        assertEquals(1, CountVowels.countVowels("a"));
    }
}
