package com.foxmula.Assignment_2;

import java.util.*;

public class HashSet {
	Set<String> set=new HashSet<String>();
    void add(String a, String b, String c, String d, String e)
	{
		
		set.add(a);
		set.add(b);
		set.add(c);
		set.add(d);
		set.add(e);
	}
	 boolean check(String a)
	{
		if(set.contains(a))
			return true;
		else
			return false;	
	}
	public static void main(String[] args)
	{
		HashSet obj=new HashSet();
		String a,b,c,d,e;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string to add in a Set ");
		a=scanner.nextLine();
		b=scanner.nextLine();
		c=scanner.nextLine();
		d=scanner.nextLine();
		e=scanner.nextLine();
		obj.add(a, b, c, d, e);
		System.out.println();
		System.out.println("R   E   S   U   L   T ");
		System.out.println();
		System.out.println("Set contains the given string ?     "+obj.check("a"));
		System.out.println("Set contains the given string ?     "+obj.check("b"));
		System.out.println("Set contains the given string ?     "+obj.check("h"));
		scanner.close();
	}
}
