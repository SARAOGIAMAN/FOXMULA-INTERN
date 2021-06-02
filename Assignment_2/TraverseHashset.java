package com.foxmula.Assignment_2;

import java.util.*;

public class TraverseHashset {
	HashSet<String> set=new HashSet<String>();
    void add(String a, String b, String c, String d, String e)
	{
		
		set.add(a);
		set.add(b);
		set.add(c);
		set.add(d);
		set.add(e);
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
		TraverseHashset obj=new TraverseHashset();
		String a,b,c,d,e;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String to add in a HashSet ");
		a=scanner.nextLine();
		b=scanner.nextLine();
		c=scanner.nextLine();
		d=scanner.nextLine();
		e=scanner.nextLine();
		obj.add(a, b, c, d, e);
		System.out.println();
		obj.Traverse();              //TRAVERSING
		scanner.close();
	}
}
