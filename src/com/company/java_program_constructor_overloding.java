package com.company;

import java.util.Scanner;

class calculation {
    calculation()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(("\n enter the number :"));
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c;
        c=a+b;
        System.out.println(("\n the sum of the two number is :"+c));

    }
    calculation(int x,int y)
    {
        int z;
        z=x*y;
        System.out.println(("\n the multiplication of the two number is :"+z));

    }
    calculation(int w)
    {
        int y=100;
        int u=y*w;
        int u1=y+w;
        System.out.println(u);
        System.out.println(u1);
    }
}

public class java_program_constructor_overloding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System .in );
        calculation obj=new calculation();
        System.out.println(obj);
        System.out.println(("\n enter the two number :a,b"));
        int x=sc.nextInt();
        int y=sc.nextInt();

        calculation obj1=new calculation( x,y);


        System.out.println(obj1);
        System.out.println(("\n enter the value of the w :"));
        int o=sc.nextInt();
        calculation obj2=new calculation(o);
        System.out.println(obj2);



    }
}
