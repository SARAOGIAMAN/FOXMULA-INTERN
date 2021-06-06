package com.foxmula.Assignment_2;

import java.util.*;

public class program2 {
	Set<String> s=new HashSet<String>();
    void add(String a, String b, String c, String d, String e)
	{
		
		s.add(a);
		s.add(b);
		s.add(c);
		s.add(d);
		s.add(e);
	}
	 boolean check(String a)
	{
		if(s.contains(a))
			return true;
		else
			return false;	
	}
	public static void main(String[] args)
	{
		program2 p=new program2();
		String a,b,c,d,e;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to add in a Set ");
		a=sc.nextLine();
		b=sc.nextLine();
		c=sc.nextLine();
		d=sc.nextLine();
		e=sc.nextLine();
		p.add(a, b, c, d, e);
		System.out.println();
		System.out.println("R   E   S   U   L   T ");
		System.out.println();
		System.out.println("Set contains the given string ?     "+p.check("a"));
		System.out.println("Set contains the given string ?     "+p.check("b"));
		System.out.println("Set contains the given string ?     "+p.check("h"));
		sc.close();
	}
}
