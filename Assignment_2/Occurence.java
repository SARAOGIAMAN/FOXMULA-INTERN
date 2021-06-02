package com.foxmula.Assignment_2;

import java.util.*;

public class Occurence {
	static ArrayList<Integer> al=new ArrayList<Integer>();
	void add(int a, int b, int c, int d, int e, int f)
	{
		
		al.add(a);
		al.add(b);
		al.add(c);
		al.add(d);
		al.add(e);
		al.add(f);
	}
	void occurance(ArrayList<Integer> al)
	{
		boolean visited[] = new boolean[al.size()];
	    Arrays.fill(visited, false);
	    for (int i=0;i<al.size();i++) {
	        if (visited[i]==true)
	            continue;
	        int count=1;
	        for (int j=i+1;j<al.size();j++) {
	            if (al.get(i)==al.get(j)) {
	                visited[j]=true;
	                count++;
	            }
	        }
	        System.out.println("     "+al.get(i) + "             " + count);
	    }
	}
	public static void main(String[] args)
	{
		Occurence obj=new Occurence();
		int a,b,c,d,e,f;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value to add in a ArrayList ");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		d=scanner.nextInt();
		e=scanner.nextInt();
		f=scanner.nextInt();
		obj.add(a, b, c, d, e, f);
		System.out.println();
		System.out.println(" ELEMENTS       FREQUENCY ");
		obj.occurance(al);
		scanner.close();
	}
}
