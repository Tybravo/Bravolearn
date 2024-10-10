package bank;

public class Television {
    private boolean isOn;
    private int volume;

    public Television(int volume) {
        this.isOn = false;
        this.volume = 2;
    }

    public void turnOn() {
        isOn = true;
    }
    public void turnOff(){
        isOn = false;
    }
    public boolean OnStatus(){
        return isOn;
    }

    public int getVolume() {
        if(this.isOn) {
            return this.volume;
        }
        return 0;
    }
}
