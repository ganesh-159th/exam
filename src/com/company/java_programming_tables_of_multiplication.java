package com.company;
import java.util.*;

public class java_programming_tables_of_multiplication {
    public static void main(String[] args) {
        System.out.println("\n enter the specific table you want :");
        Scanner sc= new Scanner( System.in);
        int a[]=new int [10];
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }


    }
}
