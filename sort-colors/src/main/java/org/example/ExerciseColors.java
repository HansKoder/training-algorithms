package org.example;

import java.util.Arrays;

public class ExerciseColors {

    private final int RED = 0;
    private final int BLUE = 2;

    // 2,0,2,1,1,0 p1 -> 0, p2 -> 6, i -> 0
    // 0,0,2,1,1,2 p1 -> 0, p2 -> 5, i -> 0
    // 0,0,2,1,1,2 p1 -> 1, p2 -> 5, i -> 1
    // 0,0,2,1,1,2 p1 -> 2, p2 -> 5, i -> 2
    // 0,0,1,1,2,2 p1 -> 2, p2 -> 4, i -> 2
    // 0,0,1,1,2,2 p1 -> 2, p2 -> 4, i -> 4
    public void sorted (int[] colors) {
        int p1 = 0;
        int p2 = colors.length - 1;
        int i = 0;

        while (i < p2) {

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

        System.out.println(Arrays.toString(colors));

    }

}
