package com.company;

import java.util.Scanner;

public class factorial_problem {
    public static void main(String[] args) {
        int fact=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("\n enter the number  :");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;


        }
        System.out.println("\n the factorial of the given number is :"+fact);
    }
}
