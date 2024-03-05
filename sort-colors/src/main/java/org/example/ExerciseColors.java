package org.example;

import java.util.Arrays;

public class ExerciseColors {

    private final int RED = 0;
    private final int BLUE = 2;

    public void sorted (int[] colors) {
        int p1 = 0;
        int p2 = colors.length - 1;
        int i = 0;

        while (i <= p2) {

            if (colors[i] == RED) {
                int temp = colors[p1];
                colors[p1] = colors[i];
                colors[i] = temp;

                p1++;
                i = Math.max(p1, i);
            } else if (colors[i] == BLUE) {
                int temp = colors[p2];
                colors[p2] = colors[i];
                colors[i] = temp;

                p2--;
            } else {
                i++;
            }

        }
    }

}
