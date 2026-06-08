package com.javaskool.javahub.ocp;

/*
 * Exercise: Fix Switch Expression
 *
 * Objective:
 * Correct the switch expression so it returns the correct day type.
 */

public class FixSwitchExpressionSolution {
    public static String getDayType(String day) {
        String result = switch (day) {
            case "Saturday", "Sunday" -> "Weekend";
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            default -> "Unknown";
        };

        return result;
    }
}
