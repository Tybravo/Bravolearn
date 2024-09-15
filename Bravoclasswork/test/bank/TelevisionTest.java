package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TelevisionTest {
    @Test
    public void TelevisionIsOn() {
        Television tv = new Television();
        tv.turnOn();
        assertTrue(tv.OnStatus());
    }

    @Test
    public void TelevisionIsOff() {
        Television tv = new Television();
        tv.turnOn();
        tv.turnOff();
        assertFalse(tv.OnStatus());
    }

    //@Test
}

