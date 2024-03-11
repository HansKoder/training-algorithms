package org.example;

public class PasswordSecurity {

    private final static int ASCII_ZERO = 48;
    private final static int ASCII_ONE = 49;

    // 1, 0, 0, 1, 1, 0
    public int getNumberOfChanges (String pwd) {

        int counterZero = 0;
        int counterOne = 0;

        // loop -> count changes each condition
        for (int i = 0; i < pwd.length(); i++) {
            // condition zero
            char character = pwd.charAt(i);
            // sequential to 1
            if (character == ASCII_ZERO) {
                counterOne++;
            } else if (character == ASCII_ONE) { // Sequential to 0
                counterZero++;
            }
        }

        // get min
        int result = Math.min(counterZero, counterOne);

        // get cant of substring length each part

        return result;
    }

}
