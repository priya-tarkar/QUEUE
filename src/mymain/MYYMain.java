package mymain;

import Arrayimplement.ArrayToQueue;

public class MYYMain {
    public static void main(String[] args) {
        ArrayToQueue qu = new ArrayToQueue(5);
        qu.enquiq(10);
        qu.enquiq(20);
        qu.enquiq(30);
        qu.enquiq(40);
        qu.enquiq(50);
        qu.traverse();
        qu.enquiq(60);
        System.out.println(qu.dequeue());
        System.out.println(qu.dequeue());
        System.out.println(qu.peek());


    }
}
