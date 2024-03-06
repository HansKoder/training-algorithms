package org.example;

import java.util.Arrays;

public class CommonItems {

    public int[] getNewArrayWithRepeatedValues (int[]arr1, int[] arr2, int[] arr3) {
        StringBuilder resTxt = new StringBuilder();

        for (int i=0; i<arr1.length; i++){

            int low = 0;
            int high = arr2.length - 1;
            boolean isCommon = false;
            int compare = arr1[i];

            while (low < high) {
                if (compare == arr2[low] || compare == arr2[high]) {
                    isCommon = true;
                    resTxt.append(compare);
                    resTxt.append(",");
                    break;
                }

                low++;
                high--;
            }

            if (isCommon) continue;

            low = 0;
            high = arr3.length - 1;
            while (low < high) {
                if (compare == arr3[low] || compare == arr3[high]) {
                    resTxt.append(compare);
                    resTxt.append(",");
                    break;
                }

                low++;
                high--;
            }

        }

        for (int i=0; i<arr2.length; i++){
            int low = 0;
            int high = arr3.length - 1;
            int compare = arr2[i];

            while (low < high) {
                if (compare == arr3[low] || compare == arr3[high]) {
                    resTxt.append(compare);
                    resTxt.append(",");
                    break;
                }

                low++;
                high--;
            }

        }

        String[] items = resTxt.toString().split(",");
        int[] res = new int[items.length];

        for (int i = 0; i < items.length; i++) res[i] = Integer.parseInt(items[i]);

        Arrays.sort(res);

        return res;

    }

}
