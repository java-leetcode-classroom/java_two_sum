import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution sol = new Solution();
    @Test
    void twoSumExample1() {
        assertArrayEquals(new int[]{0,1}, sol.twoSum(new int[]{2,7,11,15}, 9));
    }
    @Test
    void twoSumExample2() {
        assertArrayEquals(new int[]{1,2}, sol.twoSum(new int[]{3,2,4}, 6));
    }
    @Test
    void twoSumExample3() {
        assertArrayEquals(new int[]{0,1}, sol.twoSum(new int[]{3,3}, 6));
    }
}