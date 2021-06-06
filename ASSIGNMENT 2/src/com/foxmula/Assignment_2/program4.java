package com.foxmula.Assignment_2;

import java.util.*;

public class program4 {
	TreeSet<Integer> t=new TreeSet<Integer>();
    void add(int a, int b, int c, int d, int e)
	{
		
		t.add(a);
		t.add(b);
		t.add(c);
		t.add(d);
		t.add(e);
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
		program4 p=new program4();
		int a,b,c,d,e;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values to add in a TreeSet ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		p.add(a, b, c, d, e);
		System.out.println();
		p.Traverse();              //TRAVERSING
		sc.close();
	}
}
