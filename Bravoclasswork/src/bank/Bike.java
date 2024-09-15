package bank;

public class Bike {

    private int bikeOn = 1;
    private int bikeOff = 0;
    private int gear = 0;
    private int speed = 0;
    private String accelerate = "Forward";
    private String decelerate = "Backward";

    public void setBike(int bikeOn, int bikeOff, int gear, int speed, String accelerate, String decelerate) {
        this.bikeOn = bikeOn;
        this.bikeOff = bikeOff;
        this.gear = gear;
        this.speed = speed;
        this.accelerate = accelerate;
        this.decelerate = decelerate;
    }

    public int getBikeOn(int bikeOn) {
        this.bikeOn = bikeOn;
        if (bikeOn == 1)
            return 1;
        return 0;
    }

    public int getBikeOff(int bikeOff) {
        this.bikeOff = bikeOff;
        if(bikeOff == 0)
            return 0;
        return 1;
    }

    public int getBikeOnGear1By1(int gear, int speed) {
        if(gear == 1 && accelerate.equals("Forward")) {
            if (speed >= 0 && speed <= 20) {
                speed = speed + 1;
                if(speed > 20){
                    gear = 2;
                    }
                return speed;
            }
        }
        else if(gear < 1 && !accelerate.equals("Forward")){
           return this.speed;
        }
        return speed;
    }

    public int getBikeOnGear2By2(int gear, int speed) {
        if(gear == 2 && accelerate.equals("Forward")) {
            if (speed >= 21 && speed <= 30) {
                speed = speed + 2;
                if(speed > 30){
                    gear = 3;
                }
                return speed;
            }
        }
        else if(gear < 2 && !accelerate.equals("Forward")){
            return this.speed;
        }
        return speed;
    }

    public int getBikeOnGear3By3(int gear, int speed) {
        if(gear == 3 && accelerate.equals("Forward")) {
            if (speed >= 31 && speed <= 40) {
                speed = speed + 3;
                if(speed > 40){
                    gear = 4;
                }
                return speed;
            }
        }
        else if(gear < 3 && !accelerate.equals("Forward")){
            return this.speed;
        }
        return speed;
    }

    public int getBikeOnGear4By4(int gear, int speed) {
        if(gear == 4 && accelerate.equals("Forward")) {
            if (speed >= 41) {
                speed = speed + 4;
                return speed;
            }
        }
        else if(gear < 4 && !accelerate.equals("Forward")){
            return this.speed;
        }
        return speed;
    }



    public int getBikeOnGearDec1By1(int gear, int speed) {
        if(gear == 1 && decelerate.equals("Backward")){
            if (speed >= 0 && speed <= 20) {
                speed = speed - 1;
                return speed;
            }
        }
        else if(gear > 1 && !decelerate.equals("Backward")){
            return this.speed;
        }
        return speed;
    }

    public int getBikeOnGearDec2By2(int gear, int speed) {
        if(gear == 2 && decelerate.equals("Backward")) {
            if (speed >= 21 && speed <= 30) {
                speed = speed - 2;
                if(speed > 30){
                    gear = 2;
                }
                return speed;
            }
        }
        else if(gear > 2 && !decelerate.equals("Backward")){
            return this.speed;
        }
        return speed;
    }

    public int getBikeOnGearDec3By3(int gear, int speed) {
        if(gear == 3 && decelerate.equals("Backward")){
            if (speed >= 31 && speed <= 40) {
                speed = speed - 3;
                if(speed < 31){
                    gear = 2;
                }
                return speed;
        }
            }
        else if(gear > 3 && !decelerate.equals("Backward")){
            return this.speed;
        }
        return speed;
    }

    public int getBikeOnGearDec4By4(int gear, int speed) {
        if(gear == 4 && decelerate.equals("Backward")) {
            if (speed >= 41) {
                speed = speed - 4;
                if(speed < 41){
                    gear = 3;
                }
                return speed;
            }
        }
        else if(gear > 4 && !decelerate.equals("Backward")){
            return this.speed;
        }
        return speed;
    }


}
