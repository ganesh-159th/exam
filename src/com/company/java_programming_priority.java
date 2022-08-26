package com.company;
import java.util.*;
class exception_01 extends  Thread
{
    public void run()
    {
        int  i=0;
        while(i<99)
        {
            System.out.println("i am th number of the clas :"+i);
            i++;
        }

    }
}
class exception_02 extends  Thread
{
    public void run()
    {
        int i=10;
        while(i<900)
        {
            System.out.println("\n the game of the number is :"+i);
            i++;

        }

    }
}

public class java_programming_priority {
    public static void main(String[] args) {
        exception_01 obj= new exception_01();
        exception_02 obj1= new exception_02();
        obj.setPriority(Thread.MAX_PRIORITY);
        obj1.setPriority(Thread.MAX_PRIORITY);
        obj1.setPriority(Thread.NORM_PRIORITY);
        obj1.setPriority(Thread.MIN_PRIORITY);
        obj.start();
        obj1.start();


    }
}

