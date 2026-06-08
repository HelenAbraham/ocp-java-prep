package com.javaskool.javahub.solutions.basics;

public class PatternVariablesSolution {
    
    public static int getStringLength(Object obj) {
        if (obj instanceof String str) {
            return str.length();
        }
        return -1;
    }
}
