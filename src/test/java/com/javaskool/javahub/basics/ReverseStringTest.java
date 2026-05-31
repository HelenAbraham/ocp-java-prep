package com.javaskool.javahub.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    
    @Test
    void shouldReverseString() {
        assertEquals("olleh", ReverseString.reverse("hello"));
    }
}
