package Arrayimplement;

import implement.QueueADT;

public class ArrayToQueue implements QueueADT {
    int front;
    int rear;
    int capacity;
    int [] arr;
    public ArrayToQueue(int capacity) {
        front = 0;
        rear = 0;
        this.capacity = capacity;
        arr = new int[capacity];
    }

    @Override
    public void enquiq(int data) {
        if(isFull())
        {
            System.out.println("queue overflow");
        }
        else
        {
            arr[rear]=data;
            rear++;
        }

    }
    int j;

    @Override
    public int dequeue() {
        int val=0;
        if(isEmpty())
        {
            System.out.println("queue underflow");
        }
        else
        {
            val=arr[front];
            front++;
        }
        return val;
    }

    @Override
    public int peek() {
        int val=0;
        val=arr[front];
        return val;
    }

    @Override
    public boolean isEmpty() {
        if(rear==0)
            return true;
        return false;
    }

    @Override
    public boolean isFull() {
        if(rear==capacity)
            return true;
        return false;
    }

    @Override
    public void traverse() {
        for (int i = 0; i <capacity; i++) {
            System.out.print(arr[i]+" ");

        }
    }


}
