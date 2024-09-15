package stackdata;

public class Stack {
    private boolean isEmpty = true;
    private int capacity;
    private int size;
    private String s;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.s = s;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public int push(int size, String s) {
        this.s = s;
        this.size++;
      //isEmpty= true;
        return size;
    }

    public int pop(int size) {
        this.size--;
        //isEmpty= false;
        return size;
    }
}

