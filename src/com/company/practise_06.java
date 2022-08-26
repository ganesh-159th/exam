package com.company;
class shadow implements Runnable

{
    public void run()
    {
        while(true)
        {
            System.out.println("\n i am the run  function of the shadow class :");
        }
    }
}class shadow1 implements Runnable

{
    public void run()
    {
        while(true)
        {
            System.out.println("\n i am the run  function of the shadow class :");
        }
    }
}


public class practise_06 {
    public static void main(String[] args) {
        shadow t1= new shadow();
        thread d=new thread();
        shadow1 t2=new shadow1();
        thread g=new thread();
        t1.run();
        t2.run();
    }
}
