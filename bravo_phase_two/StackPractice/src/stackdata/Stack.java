package stackdata;

public class Stack {
    private final int capacity;
    private int size;
    private final String[] strElements;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.strElements = new String[capacity];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return true;
    }

    public void push(String s) {
        if (size < capacity) {
            strElements[size] = s;
            size++;
        } else {
            System.out.println("Stack is full");
        }
    }

    public void pop() {
        if (size > 0) {
            strElements[size - 1] = null;
            size--;
        } else {
            System.out.println("Stack is empty");
        }
    }

}


