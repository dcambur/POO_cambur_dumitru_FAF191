package oop.lab2;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box("box1", 14,9,17);
        Box box2 = new Box("box2", 8,4,5);
        Box box3 = new Box("box3", 5,10,6);

        box1.printArea();
        box1.printVolume();

        box2.printArea();
        box2.printVolume();

        box3.printArea();
        box3.printVolume();

        Queue queue = new Queue(2);
        queue.enqueue(box1);
        queue.enqueue(box2);
        queue.enqueue(box3);

        queue.printElements();

        queue.dequeue();
        queue.printElements();

        queue.isEmpty();
        queue.dequeue();
        queue.dequeue();


        Queue queue1 = new Queue();
        queue1.enqueue(box1);
        queue1.printElements();
    }
}
