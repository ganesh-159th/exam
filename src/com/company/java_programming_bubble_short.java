package com.company;
import java.util.*;
import java.util.Scanner;

public class java_programming_bubble_short {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("\n enter the size of the array:");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.println("\n enter the element in the array size :");
        for(int i=0;i<(n-1);i++)
        {
            a[i]=sc.nextInt();
        }
for(int i=0;i<(n-1);i++)
{
    for(int j=0;j<(n+i-1);j++)
    {
        if(a[i]>a[i++])
        {
            int temp=a[i];
            a[i]=a[i++];
            a[i++]=temp;
        }
    }
}

        System.out.println("\n after the shorting of the element is :");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
