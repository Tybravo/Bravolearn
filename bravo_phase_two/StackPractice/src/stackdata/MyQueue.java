package stackdata;

import java.util.NoSuchElementException;

public class MyQueue {
    private int number;
    private final String[] elements;

    public MyQueue(int capacity) {
        elements = new String[capacity];
        this.number = 0;
    }

    public boolean isEmpty() {
        return number == 0;
    }

    public boolean enqueue(String states) {
        isFull();
        elements[number++] = states;
        return true;
    }

    public int getSize(){
        return this.number;
    }

    public void dequeue(String states) {
        if(isEmpty()) throw new NoSuchElementException("Queue is empty");
        String head = indexZero();
        String[] elements = shift();
        elements[number--] = states;
    }

    public String myPeek() {
        return elements[number];
    }

    public String indexZero(){
        if(isEmpty()) return null;
        return elements[0];
    }

    public String[] shift(){
        for(int index = 1; index < elements.length; index++) {
            elements[index-1] = elements[index];
        }
        return elements;
    }

    public void isFull(){
        boolean isFull = number == elements.length;
        if(isFull) throw new IllegalStateException("Queue is full");
    }

}