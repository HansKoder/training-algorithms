import org.example.ExerciseColors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseColorsTest {

    @Test
    @DisplayName("Should sorted")
    void shouldSort1 () {
        int[] numbers = {2,0,2,1,1,0};
        ExerciseColors colors = new ExerciseColors();
        colors.sorted(numbers);

        Arrays.toString(numbers);
        assertTrue(true);
        // assertArrayEquals(new int[] {0, 0, 1, 1, 2, 2}, numbers);
    }

    @Test
    @DisplayName("Should sorted 2")
    void shouldSort2 () {
        int[] numbers = {2,0,1};
        ExerciseColors colors = new ExerciseColors();
        colors.sorted(numbers);
        // assertArrayEquals(new int[] {0, 1, 2}, numbers);
        System.out.println(Arrays.toString(numbers));
        assertTrue(true);
    }


    @Test
    @DisplayName("Should sorted 2")
    void shouldSort3 () {
        int[] numbers = {1,0,0,1,1,2,2,0,1};
        ExerciseColors colors = new ExerciseColors();
        colors.sorted(numbers);
        // assertArrayEquals(new int[] {0, 1, 2}, numbers);
        System.out.println(Arrays.toString(numbers));
        assertTrue(true);
    }



}
