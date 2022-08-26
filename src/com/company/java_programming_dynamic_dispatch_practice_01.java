package com.company;

import java.util.Scanner;

class hello
{
    void name()
    {
        System.out.println("\n this is name from the base class ");
    }
}
class helloWorld extends hello
{
    void name1()
    {
        System.out.println("\n this is name 1 from the derived class :");
    }

}

public class java_programming_dynamic_dispatch_practice_01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       // hello name=new hello(); // this is the object created for the base class . we get the result according to that //
     //   name.name();
        //helloWorld name1=new helloWorld();// this is the object created fot the derived class. we get the result according to that//
      //  name1.name1();
    //   name1.name();
        hello name2= new helloWorld();// this is call dynamic dispatch because the base class object and the derived class new allocation is given their //
        name2.name();
    }

}
