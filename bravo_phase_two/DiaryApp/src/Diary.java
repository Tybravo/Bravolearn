
public class Diary {
    private boolean locked = false;


    public void lock() {
        locked = true;
    }
    public void unlock() {
        locked = false;
    }

    public boolean isLocked() {
        return locked;
    }





}
