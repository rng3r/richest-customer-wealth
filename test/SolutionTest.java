import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test6() {

        int[][] accounts = {
                {1, 2, 3,},
                {3, 2, 1}
        };

        assertEquals(6, new Solution().maximumWealth(accounts));
    }

    @Test
    public void test10() {
        int[][] accounts = {
                {1, 5,},
                {7, 3,},
                {5, 3,},
        };

        assertEquals(10, new Solution().maximumWealth(accounts));
    }

    @Test
    public void test17() {
        int[][] accounts = {
                {2,8,7},
                {7,1,3},
                {1,9,5},
        };

        assertEquals(17, new Solution().maximumWealth(accounts));
    }



}