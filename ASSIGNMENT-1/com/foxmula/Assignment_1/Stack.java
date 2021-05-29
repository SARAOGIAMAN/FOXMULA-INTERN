package com.foxmula.Assignment_1;

public class Stack {
    Node top;
    Stack()
    {
        this.top=null;
    }
    public void push(int x)
    {
        Node temp=new Node();
        temp.next=top;
        top=temp;
    }
    public void pop()
    {
        if(top==null)
        {
            System.out.println("Stack Underflow");
            return;
        }
        top=top.next;
    }

    public boolean isEmpty()
    {
        return top==null;
    }
    public int count()
    {
        int c=0;
        Node temp=top;
        while(temp!=null)
        {
            temp=temp.next;
            c++;
        }
        return c;
    }
}