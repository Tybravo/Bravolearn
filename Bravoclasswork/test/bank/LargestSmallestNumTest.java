package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class LargestSmallestNumTest {

    @Test
    public void test_to_return_array_largest_Smallest_num() {
        int [] arrayOfNum = {2, 3, 6, 7, 8};
        int [] expected = {8, 2};

        int[] result = largestSmallestNum.getNumbers(arrayOfNum);
        assertArrayEquals(result, expected);
    }

}

