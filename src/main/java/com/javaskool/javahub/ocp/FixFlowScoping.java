package com.javaskool.javahub.ocp;
/*
 * Exercise: Fix Flow Scoping
 *
 * Objective:
 * Correct the condition so the pattern variable is safely in scope.
 *
 * Your task:
 * Return true if obj is a String with length greater than 3.
 */
public class FixFlowScoping {
    public static boolean isLongString(Object obj) {
        if (obj instanceof String text || text.length() > 3) {
            return true;
        }

        return false;
    }
}
