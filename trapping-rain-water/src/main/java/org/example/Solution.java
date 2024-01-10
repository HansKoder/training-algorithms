package org.example;

public class Solution {

    // {3,1,1,2}
    public int trap (int[] points) {
        if (points.length < 3) return 0;

        int idxLow = 0; // 0
        int idxHigh = points.length - 1; // 3

        int maxLow = points[idxLow]; // 3
        int maxHigh = points[idxHigh]; // 2

        int res = 0; // + 1 + 1 + 0 => 2

        // 0 < 3 | 0 < 2 | 0 < 1 | 0 < 0 Break
        while (idxLow < idxHigh) {

            // 3 < 2 => F
            if (maxLow < maxHigh) {
                idxLow++;
                maxLow = Math.max(maxLow, points[idxLow]);
                res += maxLow - points[idxLow];
            } else {
                idxHigh--; // 0
                maxHigh = Math.max(maxHigh, points[idxHigh]); // Max(2, 3) => 3
                res += maxHigh - points[idxHigh]; // 3 - 3 => 0
            }
        }

        return res;
    }

}
