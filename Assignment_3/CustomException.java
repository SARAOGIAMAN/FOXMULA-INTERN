package com.foxmula.Assignment_3;

import java.util.*;

public class CustomException 
{
	private void CheckPrimeOdd(int n)
	{
		try
		{
			if(isPrime(n)&&n%2==1)
			{
				throw new ArithmeticException("Number is Invalid");
			}
			else
			{
				System.out.println("No Exception Found");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
	public static boolean isPrime(int n) 
	{  
	       if(n<=1) 
	       {  
	           return false;  
	       }  
	       for(int i=2;i<Math.sqrt(n);i++) 
	       {  
	           if(n%i==0) 
	           {  
	               return false;  
	           }  
	       }
	       return true;
	}
	public static void main(String[] args)
	{
		CustomException obj=new CustomException();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scanner.nextInt();
		obj.CheckPrimeOdd(n);
		scanner.close();
	}
}