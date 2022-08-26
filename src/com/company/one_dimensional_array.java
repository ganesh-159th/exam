package com.company;
import java.util.*;
import java.util.Scanner;

public class one_dimensional_array {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        System.out.println("\n enter the size of the array ");
        int a[]=new int[67];
        int c= sc.nextInt();
        System.out.println( "\n the entered size of the array is :"+c);
        for(int i=0;i<c;i++)
        {
            System.out.println("\n enter the element in the array :");
            a[i]=sc.nextInt();
        }
        System.out.println("\n you're entered element is  :");
        for(int i=0;i<c;i++)
        {
            System.out.println(a[i]);
        }





    }
}
