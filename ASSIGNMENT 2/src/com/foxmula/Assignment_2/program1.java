package com.foxmula.Assignment_2;

import java.util.*;

public class program1 {
	ArrayList<Integer> al=new ArrayList<Integer>();
    void add(int a,int b,int c,int d,int e)
	{
		
		al.add(a);
		al.add(b);
		al.add(c);
		al.add(d);
		al.add(e);
	}
	 boolean check(int a)
	{
		if(al.contains(a))
			return true;
		else
			return false;	
	}
	public static void main(String[] args)
	{
		program1 p=new program1();
		int a,b,c,d,e;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values to add in an ArrayList ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		p.add(a, b, c, d, e);
		System.out.println();
		System.out.println("R   E   S   U   L   T ");
		System.out.println();
		System.out.println("ArrayList contains the given value ?     "+p.check(2));
		System.out.println("ArrayList contains the given value ?     "+p.check(3));
		System.out.println("ArrayList contains the given value ?     "+p.check(9));
		sc.close();
	}
}
