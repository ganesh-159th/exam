package com.company;

import java.util.Scanner;

interface  shape{
    int area();
    int volume();
}
class circle implements  shape
{


    @Override
    public int area() {
        Scanner s= new Scanner(System.in);

        System.out.println("\n enter the radius of the circle");
        int r= s.nextInt();
        System.out.println("\n the area of the circle is :"+3.14*r*r);


        return 0;
    }

    @Override
    public int volume() {
        Scanner s= new Scanner(System.in);

        System.out.println("\n enter the radius of the circle");
        int r= s.nextInt();
        System.out.println("\n the volume of the circle is :"+4/3*3.14*r*r);

        return 0;
    }
}
class rectangle implements  shape
{

    @Override
    public int area() {
        Scanner sc= new Scanner(System.in);

        System.out.println("\n enter the l and h value :");
        int l= sc.nextInt();
        int h=sc.nextInt();
        System.out.println("\n the area of the rectangle is :"+l*h);
        return 0;
    }

    @Override
    public int volume() {
        Scanner sc= new Scanner(System.in);

        System.out.println("\n enter the l and h  and w value :");
        int l= sc.nextInt();
        int h=sc.nextInt();
        int w= sc.nextInt();
        System.out.println("\n the volume of the rectangle is :"+l*h*w);

        return 0;
    }
}

public class shape_interface {
    public static void main(String[] args) {
        circle obj= new circle();
        obj.area();
        obj.volume();
        rectangle obj1= new rectangle();
        obj1.area();
        obj1.volume();
    }
}
