package com.company;
class thread0 extends Thread
{ @Override public void run() {int i=0;while (i==10) {super.run();{System.out.println("\n hello to this world and i have actually done this java programming :");
                i++;}}}}
class thread45 extends thread0
{ public void run() {int u=0;while (true) {System.out.println("\n hello ");u++;}}}

public class java_programming_thread_exception {
    public static void main(String[] args) {
        thread0 obj3 = new thread0();
        thread45 obj4 = new thread45();
        obj3.start();
        try {
            obj3.join();
        } catch (Exception u) {
            System.out.println("\n the name of the class is :" + u);
        }
        obj3.start();
    }
}
