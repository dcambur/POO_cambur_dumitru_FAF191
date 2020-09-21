package oop.lab2;


import java.util.ArrayList;
import java.util.LinkedList;

public class Queue {

    private LinkedList<Box> Queue_List = new LinkedList<>();
    public Queue() {
    }

    public Queue(Box box) {
        this.Queue_List.add(box);
    }
    public void enqueue(Box box) {
        this.Queue_List.push(box);
    }

    public void dequeue() {
        this.Queue_List.remove();
    }

    public void isEmpty() {
        if(this.Queue_List.size() == 0) {
          System.out.println("Queue is empty");
        }
        else{
            System.out.println("Queue is not empty");
        }
    }

    public void printElements() {
        System.out.print("Your Elements:");
        for(Box s:this.Queue_List) {
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
}
