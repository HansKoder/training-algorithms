import org.example.CommonItems;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonItemsTest {

    @Test
    @DisplayName("Should get a new array with those values [2,4,9]")
    void should () {
        CommonItems commonItems = new CommonItems();

        int[] arr1 = new int[] {9,4,3};
        int[] arr2 = new int[] {2,9};
        int[] arr3 = new int[] {2,4};

        int[] response = commonItems.getNewArrayWithRepeatedValues(arr1, arr2, arr3);

        assertEquals(3, response.length);

        assertEquals(2, response[0]);
        assertEquals(4, response[1]);
        assertEquals(9, response[2]);
    }
}
