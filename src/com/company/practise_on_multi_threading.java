package com.company;
interface first
{
    void section();
    void root();

}

class yoga extends thread45 implements first
{
    public synchronized void run() {
        while (true) {
            System.out.println("\n this system is going to run the running  state :");


        }
    }

    @Override
    public void section() {
        System.out.println("\n foundation of the day by the section block");
    }

    @Override
    public void root() {
        System.out.println("\n  conformation of the foundation in the condition ");

    }
}
class yoga_01 extends yoga {
    public void run() {
        while (true) {
            System.out.println("\n the name of the school is :");
        }
    }
}

public class practise_on_multi_threading {
    public static void main(String[] args) {
        yoga obj=new yoga();
        yoga_01 obj1= new yoga_01();
        //obj.run();
        obj.start();
        obj.setPriority(20);
        obj.root();
        obj.section();
        obj1.start();
    }
}
