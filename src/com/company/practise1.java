package com.company;

import java.util.Scanner;

public class practise1 {
    public static void main(String[] args) {
        System.out.println("\n enter the number ");
        Scanner sc= new Scanner(System.in);
        int h=sc.nextInt();
        int arr[]=new int[h];
        for(int i=0;i<h;i++)
        {
            System.out.println("\n enter the elements in the loop");
            arr[i]=sc.nextInt();

        }
        for(int j=arr.length-1;j>=0;j--)
        {
            System.out.println(arr[j]);
        }
    }
}
