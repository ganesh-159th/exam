package com.company;

import java.util.Scanner;

public class java_programming_throw_throws {
    public static  int sum (int a,int b) throws ArithmeticException
    {
        int z;
        z=a+b;
        z=a-b;
        z=a*b;
       return z;

    }
    public static String String (String a)
    {
        String k;
        k=a;

        return k;
    }
    public static void main(String[] args) {
        System.out.println("\n welcome to the program and the key to use the throw and and try bock ");
        try
        {
            Scanner sc=new Scanner(System .in);
            System.out.println("\n enter the two number :");
            int a=sc.nextInt();
            int b=sc.nextInt();
            sum(a,b);
            System.out.println("\n enter the string of the length form the given from :");
            String c=sc.toString();
          String(c);
            throw new ArithmeticException("\n the number is out of range :");


        }
        catch(Exception e)
        {
            System.out.println("\n the exception has been occurred in the given string :");
            System.out.println("\n the given number has a exception ");
        }

    }
}
