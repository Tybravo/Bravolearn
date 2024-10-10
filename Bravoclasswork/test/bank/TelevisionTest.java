package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TelevisionTest {
    Television tv;
    @BeforeEach
    public void setUp() {
        tv = new Television(2);
    }

    @Test
    public void TelevisionIsOff() {
        tv.turnOn();
        tv.turnOff();
        assertFalse(tv.OnStatus());
    }
    @Test
    public void TelevisionIsOn() {
        tv.turnOff();
        tv.turnOn();
        assertTrue(tv.OnStatus());
    }

    @Test
    public void television_Can_Get_Volume_When_Turned_On() {
        tv.turnOn();
        int volume = tv.getVolume();
        assertTrue(volume > 0);
    }

    @Test
    public void television_Cannot_Get_Volume_When_Turned_Off() {
        tv.turnOff();
        int volume = tv.getVolume();
        assertFalse(volume > 0);
    }

}

