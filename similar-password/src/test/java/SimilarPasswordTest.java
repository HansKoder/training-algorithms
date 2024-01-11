import org.example.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimilarPasswordTest {

    private Solution solution = new Solution();

    @Test
    public void shouldBeOne () {
        assertEquals(1, solution.similarPassword("abcd"));
    }

    @Test
    public void shouldBeTwo () {
        assertEquals(2, solution.similarPassword("bigbangt"));
    }

    @Test
    public void should () {
        assertEquals(2, Math.abs(-2));
    }

}
