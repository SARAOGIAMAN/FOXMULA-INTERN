package com.foxmula.Assignment_2;

import java.util.*;

public class program3 {
	HashSet<String> s=new HashSet<String>();
    void add(String a, String b, String c, String d, String e)
	{
		
		s.add(a);
		s.add(b);
		s.add(c);
		s.add(d);
		s.add(e);
	}
    void Traverse()
    {
    	Iterator<String> i=s.iterator();
    	while(i.hasNext())
    	{
    		System.out.println(i.next());
    	}
    }
	public static void main(String[] args)
	{
		program3 p=new program3();
		String a,b,c,d,e;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to add in a HashSet ");
		a=sc.nextLine();
		b=sc.nextLine();
		c=sc.nextLine();
		d=sc.nextLine();
		e=sc.nextLine();
		p.add(a, b, c, d, e);
		System.out.println();
		p.Traverse();              //TRAVERSING
		sc.close();
	}
}
