package com.company;
import java.util.Scanner;

class my_thread extends Thread // the use of the thread is for concurrency : it means that .i am do the different work at the same time //
{
    public void run ()
    {

        while(true)
        {
            System.out.println("\n  i am chatting with my friend  ");

        }
    }

}
class my_thread2 extends my_thread
{
    public void run ()
    {


        while(true)
        {
            System.out.println("\n i am doing cording in the class ");
        }
    }
}


public class java_programming_Threading_class {
    public static void main(String[] args) {

        my_thread obj=new my_thread();
        my_thread2 obj1=new my_thread2();
        obj.start();
        obj1.start();
        obj.run();
        obj1.run();




    }



}
