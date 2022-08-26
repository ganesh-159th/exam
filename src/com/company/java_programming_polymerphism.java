package com.company;

import java.util.Scanner;

class calculator
{
    int area(int a,int b)
    {
        int z;
        z=a+b;
        System.out.println(z);
        return 0;

    }
    float area(int a,int b,int c)
    {
        int g;
        g=a*b*c;
        System.out.println(g);
        return 0;
    }
}
class calculator1 extends calculator
{
    int  area1 (int a,int b)
    {
        int d;
        d=a/b;
        if(b==0)
        {
            System.out.println("\n the given number can't be divided :");
        }
        else
        {
            System.out.println(d);
            return (d);

        }
       return (d);



    }
    float area1(int g,int h,int o)
    {
        int u;
        u=g-h*o;
        System.out.println(u);
        return u;


    }

}

public class java_programming_polymerphism {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        calculator1 obj1=new calculator1();
        calculator obj2= new calculator();
        System.out.println("\n the given has been displayed in the program :");
        obj1.area(4,5);
        obj1.area(6,7);
        obj2.area(678,567,233);
        obj2.area(5,0);


    }
}
