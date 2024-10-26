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
            if (this.volume > 0 && this.volume <= 10) {
                return this.volume;
            }
        }
        return 0;
    }

    public void set_volume(int volume){
        if(!this.isOn) {
            System.out.println("TV is off. Please turn it on before setting a volume level.");
        }
        if (volume > 0 && volume <= 10) {
            this.volume = volume;
        }
        else
            throw new IllegalArgumentException("Volume level should be between 1 and 10.");
}

    public int increase_volume(){
        if(this.isOn) {

            if(this.volume < 10) {
                this.volume = this.volume + 1;
            }
        }
        return this.volume;
    }


}
