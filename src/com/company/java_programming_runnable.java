package com.company;
class My_thread1 implements Runnable {
    public void run()
    {
        while(true) {
            System.out.println("\n i am the runnable of the my_thread1");
        }

    }

}
class my_thread4 implements  Runnable
{
    public void run()


    {
        while(true)
        {
        System.out.println("\n i am the runnable of the my_thread4 ");
    }
    }
}

public class java_programming_runnable {
    public static void main(String[] args) {

        my_thread obj= new my_thread();
        Thread a= new Thread(obj);
        my_thread4 obj1=new my_thread4();
        Thread b= new Thread(obj1);
        a.start();
        b.start();
    }
}
