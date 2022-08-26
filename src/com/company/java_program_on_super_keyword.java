package com.company;
import java.util.*;

class school6
{
    int  fun()
    {
        System.out.println("\n the fun  is the base class of the function :");
        return 0;


    }
    int roll()
    {
        System.out.println("\n i am the roll from the base class function :");
        return 0;

    }
}
class tearcher7 extends school6
{
    int  fun()
    {
        System.out.println("\nt he fun1 function is the member function of the derived class :");

        return 0;
    }
    void display()
    {
        System.out.println(super.fun());
    }
    tearcher7()
    {
        System.out.println("\n i am the constructor of the derived class function :");
        roll();

    }
}

public class java_program_on_super_keyword {
    public static void main(String[] args) {
        tearcher7 obj1=new tearcher7();
        obj1.display();
       obj1.fun();
       obj1.roll();


       school6 obj2=new tearcher7();
       obj2.fun();
       obj2.roll();
       obj2.hashCode();
       obj2.getClass();
      //  obj2 instanceof tearcher7 ? ((tearcher7) obj2) : null;
    }
}
