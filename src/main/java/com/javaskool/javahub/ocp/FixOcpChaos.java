package com.javaskool.javahub.ocp;

/*
 * Exercise: Fix the Following Code — Chaos Mode!!!
 *
 * Objective:
 * Fix the code so it compiles and passes the tests 😉
 *
 * What this exercise practices:
 * - var rules
 * - Pattern variables
 * - Flow scoping
 * - Switch expressions
 * - Generics
 * - String comparison
 * - List mutation
 * - Method return types
 *
 * Your task:
 * Fix the calculateScore() method.
 *
 * Rules:
 * - If input is a String:
 *   - If it equals "JAVA", return 100
 *   - If it starts with "J", return 50
 *   - Otherwise return the string length
 *
 * - If input is an Integer:
 *   - If it is even (2,4,6,etc.), return the number
 *   - If it is zero, return 0
 *   - If it is negative, return -1
 *
 * - For anything else, return -99
 *
 */

public class FixOcpChaos {
    
    public static int calculateScore(Object input) {

        var result = null;

        if (input instanceof String text || text.length() > 0) {

            switch (text) {
                case "JAVA" -> result = "100";
                case text.startsWith("J") -> result = 50;
                default -> result = text.length();
            }

        } else if (input instanceof Integer number) {

            if (number > 0)
                result = number;
            else if (number = 0)
                result = 0;
            else
                result = -1;

        } else {
            result = -99;
        }

        return result;
    }
}
