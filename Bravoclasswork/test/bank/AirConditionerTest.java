package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AirConditionerTest {

    @Test
    public void testForMyAc_IsOn() {
        AirCondition aircon = new AirCondition();
        aircon.turnOn();
        assertTrue(aircon.OnStatus());
    }

    @Test
    public void testForMyAc_IsOff() {
        AirCondition aircon = new AirCondition();
        aircon.turnOn();
        aircon.turnOff();
        assertFalse(aircon.OnStatus());
    }


    @Test
    public void testForMyAc_TempIncreased() {
        AirCondition aircon = new AirCondition();
        aircon.turnOn();
        assertTrue(aircon.OnStatus());
        boolean result3 = aircon.isTempIncreased(true);
        assertEquals(true, result3);
    }

    @Test
    public void testForMyAc_TempDecreased() {
        AirCondition aircon = new AirCondition();
        aircon.turnOn();
        assertTrue(aircon.OnStatus());
        boolean result2 = aircon.isTempDecreased(true);
        assertEquals(true, result2);
    }

    @Test
    public void testForMyAc_TempIncreasedBeyond30() {
        AirCondition aircon = new AirCondition();
        aircon.turnOn();
        assertTrue(aircon.OnStatus());
        int result2 = aircon.isHighest(30);
        assertEquals(30, result2);
        int result3= aircon.isBeyond30(40);
        assertEquals(30, result3);
    }

    @Test
    public void testForMyAc_TempDecreasedBelow16() {
        AirCondition aircon = new AirCondition();
        aircon.turnOn();
        assertTrue(aircon.OnStatus());
        int result2 = aircon.isLowest(16);
        assertEquals(16, result2);
        int result3 = aircon.isBelow16(5);
        assertEquals(16, result3);
    }



}
