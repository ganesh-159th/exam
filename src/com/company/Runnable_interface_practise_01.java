package com.company;


class runnable01 implements  Runnable{

    @Override
    public synchronized void run() {
        int i=0;
        while(i<9)
        {
            System.out.println(i);
            i++;
        }
    }

}
class runnable02 extends runnable01 implements Runnable {
    public void run(){
        int i=99;
        while(i<111)
        {
            System.out.println(i);
            i++;
        }
    }
}

public class Runnable_interface_practise_01 {
    public static void main(String[] args) {
        runnable02 obj= new runnable02();
     Thread a= new Thread(obj);
     runnable01 obj1= new runnable01();
     Thread b= new Thread(obj1);


        a.start();
       b.start();

    }

}
