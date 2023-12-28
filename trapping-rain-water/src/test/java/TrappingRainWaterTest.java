import org.example.TrappingRainWater;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrappingRainWaterTest {

    private TrappingRainWater trappingRainWater = new TrappingRainWater();

    @Test
    public void shouldBeSix () {
        int[] points = {0,1,0,2,1,0,1,3,2,1,2,1};

        assertEquals(6, trappingRainWater.cantOfWater(points));
    }

}
