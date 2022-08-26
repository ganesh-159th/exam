package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
class Not_divided_zero extends Exception
{


    {
        System.out.println("\n the given number is not divisible by zero ");

    }
}
interface  calcuation
{
    public int sum();
    public int division();
}

class sum
{
    int sum1(int a,int b)
    {
        return a+b;
    }
}
class division extends sum implements calcuation
{

    @Override
    public int sum() {
        System.out.println("\n the sum of the two number is :");

        return 0;
    }

    @Override
    public int division() {
        int b;

        System.out.println("\n the division of the otw number is :");
        return 0;

    }
}



// print the sum of the two number using the method and sartic methods //
public class java_programming_practice_question {
    /*

    static int sum(int a,int b)
    {
        return a+b;
    }

     */
    public static void main(String[] args) throws Not_divided_zero {
        Scanner sc= new  Scanner (System .in);
       // sum  obj= new sum ();
        division obj1=new division();


        System.out.println("\n enter the two number :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= obj1.sum1(a,b);
        int g=obj1.sum();
        int h=obj1.division();

      //  int c=obj.sum(a,b);

      //  System.out.println("\n the usm of the two number is :"+sum(a,b));
        System.out.println("\n the sum of the two number without use of the static keyword :"+c);
        System.out.println("\n the sum of the two number without use of the static keyword :"+g);
        System.out.println("\n the sum of the two number without use of the static keyword :"+h);


    }
}
