package ASSIGNMENT_1;

import java.util.Scanner;

public class Stackimp
{
	 public void display(Stack st1,Stack st2)
	    {
	        if(st1.count()==st2.count())
	        {
	            System.out.println("Total Numbers of Elements in both stack is : " + st2.count());
	        }
	    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Stack s1=new Stack(20);
		Stack s2=new Stack(20);
		int ch,data;
		Stackimp si=new Stackimp();
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
				System.out.println(s1.pop());
				si.display(s1,s2);
				break;
			case 4:
				System.out.println(s2.pop());
				si.display(s1,s2);
				break;
			default:
				System.out.println("INVALID CHOICE");
				break;
			}
		}
	}
}

class Stack {
	private int s[];
	private int top,max;
	Stack(int i)
	{
		max=i;
		s=new int[max];
		top=0;
	}
	void push(int data)
	{
		if(top>=max)
		{
			System.out.println("Stack overflow");
		}
		else
		{
			s[top]=data;
			top++;
		}
	}
	int pop()
	{
		int data=0;
		if(checkEmpty())
		{
			System.out.println("Stack is Empty");
			return 0;
		}
		else
		{
			top--;
			data=s[top];
			s[top]=0;
			return data;				
		}
	}
	boolean checkEmpty()
	{
		if(max==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int count()
	{
		return top;
	}
}
