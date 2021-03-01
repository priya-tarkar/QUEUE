package implementation;

import interfaceADT.Queue;

public class SinglyToQueue implements Queue {
    Node front;
    Node rear;
    public SinglyToQueue()
    {
        front=null;
        rear=null;
    }

    @Override
    public void enquiue(int data) {
        Node node=new Node(data);
        if(isEmpty())
        {
            front=node;
            rear=node;
        }
        else
        {
            rear.next=node;
            rear=node;
        }

    }

    @Override
    public void dequeue() {
        if(isEmpty())
        {
            System.out.println("queue underflow");
        }
        else
        {
            if(front==rear)
            {
                front=null;
                rear=null;
            }
            else
            {
                front=front.next;
            }
        }

    }

    @Override
    public int peek() {
        if(!isEmpty())
            return front.data;
        else
            return 0;//defautl invalid value
    }

    @Override
    public boolean isEmpty() {
        if(front==null)
            return true;
        return false;
    }

    @Override
    public void traverse() {
        Node temp=front;
        System.out.print("front---->");
        while (temp!=null)
        {
            System.out.print(temp.data+"------>");
            temp=temp.next;
        }
        System.out.println("rear");
    }
}
