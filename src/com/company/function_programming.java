package com.company;
import java.util.Scanner;

public class function_programming {
    // programming using the static key word //
   /* static int sum  (int x,int y)
    {
        int z;
        if(x>y)
        {
            z=x+y;
            return (z);
        }
        else {
            z=(x*y)+x;
            return (z);
        }
    }
    static int multiplication (int i, int o)
    {
        int u;
        u=i*o;
        return (u);
    }

    */
    // function function without static key word is //
        int sum  (int x,int y)
    {
        int z;
        if(x>y)
        {
            z=x+y;
            return (z);
        }
        else {
            z=(x*y)+x;
            return (z);
        }
    }
    int multiplication (int i, int o)
    {
        int u;
        u=i*o;
        return (u);
    }

    public static void main(String[] args) {
        System.out.println(("\n enter the two number :"));
        Scanner sc=new Scanner(System.in );
        int a=sc.nextInt();
        int b=sc.nextInt();

        function_programming obj=new function_programming();//  if you want to use the function without the static  keyword then  we have to use the ayntex is the class name_object =new .class name ();
        int  c = obj.sum(a,b);


        //c= sum(a,b);
        System.out.println("\n the value is :"+c);
        int k=obj.multiplication (a,b);
       // k=multiplication(a,b);
        System.out.println("\n the multiplication of the given number is :"+k);


    }
}
