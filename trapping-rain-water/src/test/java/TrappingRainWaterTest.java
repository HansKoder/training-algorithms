import org.example.Solution;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrappingRainWaterTest {

    private Solution trappingRainWater = new Solution();

    @Test
    public void shouldReturnZeroSinceTheListJustHasTwoNumbers () {
        assertEquals(0, trappingRainWater.trap(new int[] {3,1}));
    }

    @Test
    public void shouldReturnNine () {
        assertEquals(9, trappingRainWater.trap(new int[] {4,2,0,3,2,5}));
    }

    @Test
    public void shouldReturnSix () {
        assertEquals(6, trappingRainWater.trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
    }


}
