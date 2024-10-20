package stackdata;

import java.util.ArrayList;

public class MyArrayList {

    private String[] list;
    private int size;
    private int capacity;

    public MyArrayList() {
        this.capacity = 5;
        this.list = new String[capacity];
        this.size = 0;
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        this.list = new String[capacity];
        this.size = 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public void myAdd(int index, String item) {
        if (size <= capacity) {
            for (int count = size; count > index; count--) {
                list[count] = list[count - 1];
            }
            list[index] = item;
            size++;
        } else {
            System.out.println("List is full");
        }
    }

    public void myRemove(int index) {
        if (index >= 0 && index <= size) {
            for (int count = index; count < size - 1; count++) {
                list[count] = list[count + 1];
            }
            list[size - 1] = null;
            size--;
        } else {
            System.out.println("List index not truly empty");
        }
    }

    public String get(int index) {
        if (index >= 0 && index < size) {
            return list[index];
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}


