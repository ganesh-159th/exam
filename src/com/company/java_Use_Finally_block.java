package com.company;

import java.util.Scanner;


public class java_Use_Finally_block {
    public static int  sum (int a,int b)throws ArithmeticException
    {
        int z=a/b;
        return z;

    }
    public static void main(String[] args) {
        System.out.println("\n welcome to the finally block :");
         Scanner sc= new Scanner(System.in);
         int a= sc.nextInt();
         int b=sc.nextInt();
         if(b==0)
         {
             try
             {
                 sum(a,b);
                 throw new ArithmeticException("\n the exception has been occurred in the given from :");

             }
             finally {
                 System.out.println("\n the exception in the given from :" );
             }


         }
    }
}
