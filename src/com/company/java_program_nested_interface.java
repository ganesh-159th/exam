package com.company;
import java.util.*;
interface google
{
   default void google1()
   {
       System.out.println("\n this the google1 form the interface of the google");
   }
    interface google2
    {
        default void google3()
        {
            System.out.println("\n this is google 3 form the interface of the google 2");
        }
        interface  google4
        {
            void google5();
        }
    }
}
class interface1 implements google.google2.google4
{

    @Override
    public void google5() {
        System.out.println("\n this is the member of the google 5 which is belongs to the interface of the google4");
    }


}

public class java_program_nested_interface {
    interface1 obj;

    {
        obj = new interface1();
    }


}
