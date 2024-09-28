package bank;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Array3by3Test {

    @Test
    public void testDisplay() {
        int rows = 3;
        int cols = 3;
        String[][] mockInput = { {"1", "0", "1"}, {"0", "1", "0"}, {"1", "1", "0"}};
        String expectedPattern = "* *\n * \n** \n";
        String actualPattern = Array3by3.display(rows, cols, mockInput);
        assertEquals(expectedPattern, actualPattern);
    }
}
