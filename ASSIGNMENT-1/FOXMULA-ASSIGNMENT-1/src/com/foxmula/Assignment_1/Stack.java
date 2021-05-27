package com.foxmula.Assignment_1;

import java.util.*;

public class Stack {
    private class Node{
        int data;
        Node next;
    }
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
class stack_imp
{
    public void display(Stack st1,Stack st2)
    {
        if(st1.count()==st2.count())
        {
            System.out.println("Total no. of elements in both the stack are equal i.e. "+st1.count());
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Stack s1=new Stack();
        Stack s2=new Stack();
        int ch,data;
        stack_imp si=new stack_imp();
        while(true)
        {
            System.out.println("1. Push in stack 1");
            System.out.println("2. Push in stack 2");
            System.out.println("3. Pop in stack 1");
            System.out.println("4. Pop in stack 2");

            System.out.println(" ENTER YOUR CHOICE ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the data");
                    data=sc.nextInt();
                    s1.push(data);
                    si.display(s1,s2);
                    break;
                case 2:
                    System.out.println("Enter the data");
                    data=sc.nextInt();
                    s2.push(data);
                    si.display(s1,s2);
                    break;
                case 3:
                    s1.pop();
                    si.display(s1,s2);
                    break;
                case 4:
                    s2.pop();
                    si.display(s1,s2);
                    break;
                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }
        }
    }
}

