package com.javaskool.javahub.ocp;

/*
 * Exercise: Fix the var Error
 *
 * Objective:
 * Correct the code so it compiles.
 *
 * Problem:
 * var cannot be assigned null without a clear type.
 *
 * Your task:
 * Fix the createName() method so it returns null as a String.
 */
public class FixVarError {
    
    public static String createName() {
        var name = null;
        return name;
    }

}
