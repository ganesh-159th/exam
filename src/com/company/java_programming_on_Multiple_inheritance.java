package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
interface school3
{
    void student1 ();
    void  teacher1();
}


class school2
{
    void student ()
    {
        System.out.println("\n this is the base clas of the function ");

    }

}
class branch extends school2 implements school3

{

    @Override
    public void student1() {
        System.out.println("\n the student is from the derived clas function :");

    }

    @Override
    public void teacher1() {
        System.out.println("\n this is the function of the derived class :");

    }

   // @Override
   @Override
   public void student() {
       System.out.println("\n this is the function of the derived by the base class :");
    }

    void teacher()
    {
        System.out.println("\n enter the name of the student :");
    }
}

public class java_programming_on_Multiple_inheritance {
    public static void main(String[] args) {
        branch obj=new branch();
        obj.teacher();
        obj.student();
    }
}
