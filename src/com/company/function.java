package com.company;
import java.util.Scanner;

public class function {
    private static final float   pi  = 3.14f;
    private static final int a = 2;
    /*
    static int area (int s) // the overloading of the function with static key word

    {
        return (s*s);
    }
    static float  area (float x,float y)
    {
        return (a*pi*x*y);
    }

     */
    // function overloading without static keyword
     int area (int s)

    {
        return (s*s);
    }
     float  area (float x,float y)
    {
        return (a*pi*x*y);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in );
        System.out.println(("\n enter the radius and hight  the circle "));
        float  a=sc.nextInt();
        float  b=sc.nextInt();
        function obj=new function();
        float c=obj.area(a,b);

       // float  result = area(a,b);
        System.out.println("\n enter the side of the circle  is :"+c);
        int v=sc.nextInt();
       // int result1=area(g);
        int result =obj.area(v);
        System.out.println(("\n the area of the cube is :"+result));



    }
}

