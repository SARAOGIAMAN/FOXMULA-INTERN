package com.foxmula.Assignment_2;

import java.util.*;

public class TraverseTreeset {
	TreeSet<Integer> set=new TreeSet<Integer>();
    void add(int a, int b, int c, int d, int e)
	{
		
		set.add(a);
		set.add(b);
		set.add(c);
		set.add(d);
		set.add(e);
	}
    void Traverse()
    {
    	Iterator<Integer> i=t.iterator();
    	while(i.hasNext())
    	{
    		System.out.println(i.next());
    	}
    }
	public static void main(String[] args)
	{
		TraverseTreeset obj=new TraverseTreeset();
		int a,b,c,d,e;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the values to add in a TreeSet ");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		d=scanner.nextInt();
		e=scanner.nextInt();
		obj.add(a, b, c, d, e);
		System.out.println();
		obj.Traverse();              //TRAVERSING
		scanner.close();
	}
}
