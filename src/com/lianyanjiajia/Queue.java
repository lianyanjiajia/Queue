package com.lianyanjiajia;

import java.util.Scanner;

public class Queue {
    class Node
    {
        public  int data;
        public Node next;
        public Node()
        {
            next=null;
        }
    }
    public Node head;
    public  Queue()
    {
        head=new Node();
    }
    public void push(int e)
    {
        Node newnode=new Node();
        newnode.data=e;
        Node p=head;
        while (p.next!=null)
            p=p.next;
        p.next=newnode;
    }
    public int pop()
    {
        if(isEmpty())
            return -1;
        int e=head.next.data;
        head.next=head.next.next;
        return e;
    }
    public boolean isEmpty()
    {
        return head.next==null?true:false;
    }
    public int getLength()
    {
        int len=0;
        Node p=head.next;
        while (p!=null)
        {
            len++;
            p=p.next;
        }
        return len;
    }
    public static void main(String[] args) {
	// write your code here
        Queue q=new Queue();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
            q.push(sc.nextInt());
        System.out.println(q.getLength());
        for(int i=0;i<3;i++)
            System.out.println(q.pop());
        System.out.println(q.getLength());

    }
}
