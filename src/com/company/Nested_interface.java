package com.company;

import java.util.*;
interface google0
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
class interface5 implements google.google2.google4
{

    @Override
    public void google5() {
        System.out.println("\n this is the member of the google 5 which is belongs to the interface of the google4");
    }


}



public class Nested_interface {
    public static void main(String[] args) {
        interface5 obj=new interface5();
        obj.google5();

    }
}
