package com.foxmula.Assignment_3;

import java.util.*;

public class Frequency {
    void frequency(int ar[],int size)
    {
        HashMap<Integer,Integer> hashmap=new HashMap<Integer,Integer>();
        for(int i=0;i<size;i++)
        {
            if(hashmap.containsKey(ar[i]))
            {
                hashmap.put(ar[i],hashmap.get(ar[i])+1);
            }
            else
            {
                hashmap.put(ar[i], 1);
            }
        }
        for (Map.Entry entry : hashmap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void main(String[] args)
    {
        Frequency obj=new Frequency();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=scanner.nextInt();
        int ar[]=new int[n];
        System.out.println(" ENTER THE VALUES IN THE ARRAY ");
        for(int i=0;i<n;i++)
        {
            ar[i]=scanner.nextInt();
        }
        obj.frequency(ar,n);
        scanner.close();
    }
}