package bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TimeTest {

    @Test
    public void test() {
        Time time = new Time(11,45,56);
        assertTrue(true);
    }
    @Test
    public void test_To_Validate_Time() {
        Time time = new Time(11,45,56);
        Assertions.assertEquals("11:45:56", time.toString());

    }
}
