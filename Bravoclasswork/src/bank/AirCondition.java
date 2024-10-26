package bank;


public class AirCondition {

    private boolean isOn;
    private int highestTemp = 30;
    private int lowestTemp = 16;
    private int aboveHighest;
    private int belowLowest;


    public void turnOn(){
        isOn = true;
    }
    public void turnOff(){
        isOn = false;
    }
    public boolean OnStatus(){
        return isOn;
    }



    public boolean isTempIncreased(boolean yes) {
        return true;
    }

    public boolean isTempDecreased(boolean yes) {
        return true;
    }

    public int isHighest(int highestTemp) {
        return 30;
    }

    public int isLowest(int lowestTemp) {
        return 16;
    }

    public void setAboveHighest(int aboveHighest) {
        this.aboveHighest = aboveHighest;
    }
    public int isBeyond30(int aboveHighest) {
        if (this.highestTemp > this.aboveHighest) {
            return 30;
        }
        return aboveHighest;
    }

    public void setBelowLowest(int belowLowest) {
        this.belowLowest = belowLowest;
    }
    public int isBelow16(int belowLowest) {
        if (this.belowLowest < this.lowestTemp) {
            return 16;
        }
        return belowLowest;
    }


}