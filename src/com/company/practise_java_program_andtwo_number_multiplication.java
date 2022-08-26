package com.company;
import java.util.*;
class calculation89
{
    int sum(int a,int b) //method one
    {
        int u=a+b;
        int y=a-b;
        System.out.println("\n the sum of the two inputs are :"+u);
        System.out.println("\n the difference of the two inputs are :"+y);
        return 0;
    }

}

public class practise_java_program_andtwo_number_multiplication {
    public static void main(String[] args) {
        System.out.println("\n here are the two number "); // in this program there is no need of taking any inputs of the user//
        int a=90,b=80;
        int c=a+b;
        int c1=a*b;
        System.out.println("\n the sum of the two number is :"+c);
        System.out.println("\n the multiplication of the two number is :"+c1);
        System.out.println("\n enter the two number :");
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        int j=sc.nextInt();// dynamic declaration of the given statement //
        int k=q*j;
        int u=q+j;
        System.out.println("\n the multiplication of the two statement is  :"+k);
        System.out.println("\n the sum of the two statement is  :"+u);
        calculation89 u1=new calculation89();
        u1.sum(a,b);







    }
}
