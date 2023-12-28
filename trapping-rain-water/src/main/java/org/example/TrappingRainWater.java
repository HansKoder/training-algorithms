package org.example;

public class TrappingRainWater {

    //  0,1,2,3,4,5,6,7,8,9,10,11 IDX
    // {0,1,0,2,1,0,1,3,2,1, 2, 1}
    // 0,1 -> pointerA=1 pointerB=2 temp=0 amount=0
    // 1,0 -> pointerA=1 pointerB=3 temp=1 amount=0
    // 1,2 -> pointerA=3 pointerB=4 temp=0 amount=1
    // 2,1 -> pointerA=3 pointerB=5 temp=1 amount=1
    // 2,0 -> pointerA=3 pointerB=6 temp=3 amount=1
    // 2,1 -> pointerA=3 pointerB=7 temp=4 amount=1
    // 2,3 -> pointerA=7 pointerB=8 temp=0 amount=5
    // 3,2 -> pointerA=7 pointerB=8 temp=0 amount=5 // I don't think that if the first point is greater
    public int cantOfWater (int[] points) {
        if (points.length <= 1) return 0;

        int pointerA = 0; // 1
        int pointerB = 1; // 3

        int amount = 0; // 1
        int tempAmount = 0; // 3

        for (int i = 0; i < points.length - 1; i++) {
            // 2 > 3
            if (points[pointerA] > points[pointerB]) {
                tempAmount += points[pointerA] - points[pointerB]; // 1 + 2 = 3
            } else if (tempAmount > 0) { // 4 > 0
                amount += tempAmount; // 5
                tempAmount = 0;
                pointerA = pointerB; // 7
            } else {
                pointerA++;
            }

            pointerB++;
        }

        return amount;
    }

}
