package com.foxmula.Assignment_2;

import java.util.ArrayList;
import java.util.Scanner;

public class PairSum {
	static ArrayList<Integer> al=new ArrayList<Integer>();
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
		int low=0,high=ar.size()-1;
		while(low<high)
		{
			if(ar.get(low)+ar.get(high)==k)
			{
				System.out.println("PAIR "+ar.get(low)+" "+ar.get(high));
			}	
			if(ar.get(low)+ar.get(high)>k) 
			{
                high--;
            }
            else 
            {
                low++;
            }
		}
	}
	public static void main(String[] args)
	{
		PairSum obj=new PairSum();
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
		System.out.println("ENTER THE VALUE OF K");
		int k=scanner.nextInt();
		System.out.println("R   E   S   U   L   T ");
		System.out.println();
		obj.find_pair(al,k);
		scanner.close();
	}
}
