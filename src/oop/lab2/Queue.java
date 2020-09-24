package oop.lab2;


import java.util.ArrayList;
import java.util.LinkedList;

public class Queue {
    private LinkedList<Box> Queue_List = new LinkedList<>();
    private int Size;

    public Queue() {
    }

    public Queue(int size) {
        this.Size = size;
    }

    private boolean checkSize() {
        return this.Queue_List.size()+1 <= this.Size;
    }

    public void enqueue(Box box) {
        if (checkSize()) {
            this.Queue_List.push(box);
        } else {
            System.out.println("Your size has reached limit");
        }
    }

    public void dequeue() {
        if (this.Queue_List.size() != 0) {
            this.Queue_List.remove();
        }
        else {
            System.out.println("Queue is already empty");
        }
    }

    public void isEmpty() {
        if (this.Queue_List.size() == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is not empty");
        }
    }

    public void printElements() {
        System.out.print("Your Elements:");
        for (Box s : this.Queue_List) {
            System.out.print(s.getName() + ' ');
        }
        System.out.println();
    }

    public LinkedList<Box> getQueue_List() {
        return Queue_List;
    }

    public void setQueue_List(LinkedList<Box> queue_List) {
        Queue_List = queue_List;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }
}
