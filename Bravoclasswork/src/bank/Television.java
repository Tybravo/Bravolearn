package bank;

public class Television {
    private boolean isOn;

    public void turnOn(){
        isOn = true;
    }
    public void turnOff(){
        isOn = false;
    }
    public boolean OnStatus(){
        return isOn;
    }

}
