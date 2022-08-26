package com.company;
class my_thread1 implements  Runnable
{
    public void run()
    {
        while(true)
        {
            System.out.println("\n the nam eis print in the  given form :");
        }
    }
}
class thread12 implements Runnable
{
    public void run(){
        while(true)
        {
            System.out.println("\n this is the second name of the class :");
        }
    }
}
public class java_practise_implement_by_interface {
    public static void main(String[] args) {
       // my_thread1 obj = new my_thread1();
        // thread a= new thread(obj);
        thread12 obj1 = new thread12();
        thread b = new thread();
        obj1.run();

    }
}