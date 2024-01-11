package org.example;

public class Solution {

    public int maxIndex (int steps, int badIndex) {
        int maxIndex = 0;

        int j = 1;

        for (int i = 0; i < steps; i++) {
            if ( (maxIndex + j) == badIndex) maxIndex -= 1;

            maxIndex += j;
            j++;
        }

        return maxIndex;
    }

}
