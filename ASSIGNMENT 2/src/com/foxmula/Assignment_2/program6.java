package com.foxmula.Assignment_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class program6 {
	private static ArrayList<Integer> al=new ArrayList<Integer>();
	void add(int a, int b, int c, int d, int e,int f)
	{
		
		al.add(a);
		al.add(b);
		al.add(c);
		al.add(d);
		al.add(e);
		
	}
	void find_pair(ArrayList<Integer> ar,int k)
	{
		Collections.sort(ar);
		int i=0,j=ar.size()-1;
		while(i<j)
		{
			if(ar.get(i)+ar.get(j)==k)
			{
				System.out.println("PAIR "+ar.get(i)+" "+ar.get(j));
			}	
			if(ar.get(i)+ar.get(j)>k) 
			{
                j--;
            }
            else 
            {
                i++;
            }
		}
	}
	public static void main(String[] args)
	{
		program6 p=new program6();
		int a,b,c,d,e,f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to add in a ArrayList ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		f=sc.nextInt();
		
		p.add(a, b, c, d, e, f);
		
		System.out.println("ENTER THE VALUE OF K");
		int k=sc.nextInt();
		System.out.println("R   E   S   U   L   T ");
		System.out.println();
		p.find_pair(al,k);
		sc.close();
	}
}