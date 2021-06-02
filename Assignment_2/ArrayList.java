package com.foxmula.Assignment_2;

import java.util.*;

public class ArrayList {
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
		ArrayList obj=new ArrayList();
		int a,b,c,d,e;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the values to add in an ArrayList ");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		d=scanner.nextInt();
		e=scanner.nextInt();
		obj.add(a, b, c, d, e);
		System.out.println();
		System.out.println("R   E   S   U   L   T ");
		System.out.println();
		System.out.println("ArrayList contains the given value ?     "+obj.check(2));
		System.out.println("ArrayList contains the given value ?     "+obj.check(3));
		System.out.println("ArrayList contains the given value ?     "+obj.check(9));
		scanner.close();
	}
}
