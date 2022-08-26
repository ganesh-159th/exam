package com.company;

import jdk.swing.interop.SwingInterOpUtils;

class mythread8 implements  Runnable
{
    public void mythread8(String name,Runnable r)
    {
        System.out.println("\n this is the nam of the string take form the class of thread "+name);

    }
    public void run()
    {
        System.out.println("\n this is the main function of the class :");

    }
}
class mythread10 extends Thread
{
    public void run()
    {
        System.out.println("\n this is the  function from the class from the thread :");
    }
}

public class java_programming_constructor__runnable_string {
    public static void main(String[] args) {
        mythread8 obj= new mythread8();
        mythread8 obj5= new mythread8();
        Thread t1= new Thread(obj);
        obj5.mythread8("deepika", t1);
        obj.mythread8("ganesh",t1);
        System.out.println("\n the nam eof the file is :"+obj);
        System.out.println("\n the nam eof the file is :"+obj5);
        mythread10 obj1= new mythread10();
        obj1.start();
        t1.start();
    }
}
