package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class BikeTest{
        @Test
        public void Bike_IsOn(){
            Bike bike = new Bike();
            int result = bike.getBikeOn(1);
            assertEquals(result,1);
        }

        @Test
        public void Bike_IsOff(){
            Bike bike = new Bike();
            int result = bike.getBikeOn(1);
            assertEquals(result,1);
            int result2 = bike.getBikeOff(0);
            assertEquals(result2,0);
        }

        @Test
        public void Bike_IsOn_WithGear1_IncrementOf1(){
            Bike bike = new Bike();
            int result = bike.getBikeOn(1);
            assertEquals(result,1);
            int result2 = bike.getBikeOnGear1By1(1,15);
            assertEquals(result2,16);
            //assertEquals(bike.getBikeOnGear1By1(3,22));
        }

        @Test
        public void Bike_IsOn_WithGear2_IncrementOf2(){
            Bike bike = new Bike();
            int result = bike.getBikeOn(1);
            assertEquals(result,1);
            int result2 = bike.getBikeOnGear2By2(2, 24);
            assertEquals(result2,26);
        }

        @Test
        public void Bike_IsOn_WithGear3_IncrementOf3(){
            Bike bike = new Bike();
            int result = bike.getBikeOn(1);
            assertEquals(result,1);
            int result2 = bike.getBikeOnGear3By3(3, 35);
            assertEquals(result2,38);
        }

        @Test
        public void Bike_IsOn_WithGear4_IncrementOf4(){
            Bike bike = new Bike();
            int result = bike.getBikeOn(1);
            assertEquals(result,1);
            int result2 = bike.getBikeOnGear4By4(4, 44);
            assertEquals(result2,48);
        }

       @Test
        public void Bike_IsOn_WithGear1_DecrementOf1(){
            Bike bike = new Bike();
            int result = bike.getBikeOn(1);
            assertEquals(result,1);
            int result2 = bike.getBikeOnGearDec1By1(1,15);
            assertEquals(result2,14);
        }

        @Test
        public void Bike_IsOn_WithGear2_DecrementOf2(){
            Bike bike = new Bike();
            int result = bike.getBikeOn(1);
            assertEquals(result,1);
            int result2 = bike.getBikeOnGearDec2By2(2,24);
            assertEquals(result2,22);
        }

        @Test
        public void Bike_IsOn_WithGear3_DecrementOf3(){
            Bike bike = new Bike();
            int result = bike.getBikeOn(1);
            assertEquals(result,1);
            int result2 = bike.getBikeOnGearDec3By3(3,35);
            assertEquals(result2,32);
        }

        @Test
        public void Bike_IsOn_WithGear3_DecrementOf4(){
            Bike bike = new Bike();
            int result = bike.getBikeOn(1);
            assertEquals(result,1);
            int result2 = bike.getBikeOnGearDec4By4(4,44);
            assertEquals(result2,40);
        }


    }
