package Main;

import implementation.SinglyToQueue;

public class MyMain {
    public static void main(String[] args) {
        SinglyToQueue s=new SinglyToQueue();
        s.enquiue(45);
        s.enquiue(10);
        s.enquiue(9);
        s.traverse();
        s.dequeue();
        s.traverse();
        System.out.println(s.peek());
        s.dequeue();
        s.dequeue();
        s.traverse();
        s.dequeue();
    }
}
