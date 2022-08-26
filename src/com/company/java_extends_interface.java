package com.company;
interface java
{
    void program();
}
interface java2
{
    void program2();
}
interface java1 extends java2,java
{
    void program1();
}
class conclusion implements java,java2,java1
{

    @Override
    public void program() {
        System.out.println("\n this is the program of the java interface one");
    }

    @Override
    public void program2() {
        System.out.println("\n this is the program2 belongs ot the java2 interface");

    }

    @Override
    public void program1() {
        System.out.println("\n this is the program1 belongs ot the java interface");

    }
}


public class java_extends_interface  {
    public static  void main(String[] args)  {
        conclusion obj=new conclusion();
        obj.program();
        obj.program1();


    }
}
