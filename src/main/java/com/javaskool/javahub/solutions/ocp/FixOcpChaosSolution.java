package com.javaskool.javahub.solutions.ocp;

public class FixOcpChaosSolution {

    public static int calculateScore(Object input) {

        int result;
        if (input instanceof String text && text.length() > 0) {

            result = switch (text) {
                case "JAVA" -> 100;
                default -> {
                    if (text.startsWith("J")) {
                        yield 50;
                    }

                    yield text.length();
                }
            };

        } else if (input instanceof Integer number) {

            if (number > 0 && number % 2 == 0)
                result = number;
            else if (number == 0)
                result = 0;
            else
                result = -1;

        } else {
            result = -99;
        }

        return result;
    }
}
