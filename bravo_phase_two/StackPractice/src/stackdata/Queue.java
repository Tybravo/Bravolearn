package stackdata;

import java.util.LinkedList;

public class Queue {
    private  LinkedList<String> queue;
    private final int capacity;
    private int size;

    public Queue(String queue) {
        this.queue = new LinkedList<>();
        this.capacity = 4;
        this.size = 0;
    }

    public boolean isEmpty() {
        this.queue = new LinkedList<>();
        return true;
    }

    public void setSize(int size) {
        size = size + 1;
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    public int capacity(){
        return this.capacity;
    }

    public boolean add(String element) {
        if(this.size < this.capacity) {
            queue.add(element);
            return true;
        }
        return false;
    }

    public boolean addFull(String element) {
        if(this.size == this.capacity) {
            throw new IllegalStateException("Cannot add element: Queue is full.");
        }
        return false;
    }


    public String remove(String element) {
        queue.remove(element);
        return element;
    }


}
