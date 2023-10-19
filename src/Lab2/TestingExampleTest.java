package Lab2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestingExampleTest {
    @Test
    void testNegativeVals() {
        assertEquals(-1, TestingExample.RewardPoints(-69, 500), "should give -1 for negative spent amount");
        assertEquals(-1, TestingExample.RewardPoints(500, -420), "should give -1 for negative credit limit");
        assertEquals(-1, TestingExample.RewardPoints(-420, -69), "should give -1 for negative spent amount and credit limit");
    }

    @Test
    void testSpentAmountLessThanCreditLimit() {
        assertEquals(-1, TestingExample.RewardPoints(420, 500), "should give -1 when spent amount is less than credit limit");
    }

    @Test
    void testDiffBy0to99() {
        assertEquals(0, TestingExample.RewardPoints(500, 500), "should give 0 points when spent amount = credit limit");
        assertEquals(0, TestingExample.RewardPoints(599, 500), "should give 0 points for $99 over limit");
        assertEquals(0, TestingExample.RewardPoints(501, 500), "should give 0 points for $1 over limit");
    }

    @Test
    void testDiffBy100to299() { // 1 point every over limit
        assertEquals(100, TestingExample.RewardPoints(600, 500), "should give 100 points for $100 over limit");
        assertEquals(299, TestingExample.RewardPoints(799, 500), "should give 299 points for $299 over limit");
    }

    @Test
    void testDiffBy300to499() { // 2 points every over limit
        assertEquals(600, TestingExample.RewardPoints(800, 500), "should give 600 points for $300 over limit");
        assertEquals(998, TestingExample.RewardPoints(999, 500), "should give 998 points for $499 over limit");
    }

    @Test
    void testDiffby500AndOver() { // 3 points every over limit
        assertEquals(1500, TestingExample.RewardPoints(1000, 500), "Should return 1500 points for $500 over limit");
        assertEquals(4500, TestingExample.RewardPoints(2000, 500), "Should return 4500 points for $1500 over limit");
    }
}
