package bank;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseArray1Test {

    @Test
    public void testReverseArray_ForNumberSet1() {
       int[] list = {1, 2, 3, 4, 5};
       int[] expected = {5, 4, 3, 2, 1};

       int[] result = ReverseArray1.reverseNum(list);
       assertArrayEquals(expected, result);
    }

    @Test public void testReverseArray_ForNumberSet2() {
        int[] list = {4, 5, 2, 1, 6};
        int[] expected = {6, 1, 2, 5, 4};

        int[] result2 = ReverseArray1.reverseNum(list);
        assertArrayEquals(expected, result2);
    }
}

