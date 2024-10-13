package stackdata;

public class ArrayList {

    private ArrayList<String> list;
    private int size;
    private int capacity;

    public ArrayList(String list) {
        this.list = new ArrayList<>();
        this.capacity = list.length();
        this.size = 0;
    }
}
