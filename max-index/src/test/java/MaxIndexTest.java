import org.example.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxIndexTest {

    private Solution solution = new Solution();

    @Test
    public void shouldBeNine () {
        assertEquals(9, solution.maxIndex(4, 6));
    }

    @Test
    public void shouldBeThree () {
        assertEquals(3, solution.maxIndex(2, 2));
    }

    @Test
    public void shouldBeTwo () {
        assertEquals(2, solution.maxIndex(2, 1));
    }

    @Test
    public void shouldBeFive () {
        assertEquals(5, solution.maxIndex(3, 3));
    }

}
