package com.company;
import java.util.Scanner;
class my_school extends  Thread
{
    public void fun() {
       while(true)
        {
            System.out.println("\n i am going the school :");
        }


    }
}
class my_self extends my_school
{
    public void fun()
    {
        while(true)
        {
            System.out.println("\n i am going the home :");
        }
    }
}

public class java_practise01_thread_class {
    public static void main(String[] args) {
        my_school obj=new my_school();
        my_self obj1=new my_self();
        obj.fun();
        obj1.fun();
        obj.start();
        obj1.start();

    }
}
