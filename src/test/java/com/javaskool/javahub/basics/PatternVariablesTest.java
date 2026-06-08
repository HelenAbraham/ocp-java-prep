package com.javaskool.javahub.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PatternVariablesTest {
    
    @Test
    void shouldReturnStringLength() {
        assertEquals(5, PatternVariables.getStringLength("hello"));
    }

    @Test
    void shouldReturnMinusOneForInteger() {
        assertEquals(-1, PatternVariables.getStringLength(42));
    }

    @Test
    void shouldReturnMinusOneForNull() {
        assertEquals(-1, PatternVariables.getStringLength(null));
    }

    @Test
    void shouldReturnCorrectLengthForAnotherString() {
        assertEquals(3, PatternVariables.getStringLength("cat"));
    }
}
