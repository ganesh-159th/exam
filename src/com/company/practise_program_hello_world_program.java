/*to print hello world */
package com.company;
import java.util.*; //accessing all the header files  which is defined by the developer //
import java.util.Scanner; //specific header file is accessed //
interface school7 // interfaces statements //
{
   void  public2(); // this is one of the method which is not defined in this  because in interface we only declare the method and. we implement this in the class //

}
class section implements  school7
{

    @Override
    public void public2() {
        System.out.println("\n this is mr.ganesh and he has done a grate job for this life "); // here we have implemented the public2() methods //
    }
}

public class practise_program_hello_world_program {
    public static void main(String[] args) {
        section obj=new section();// we have declared the object for the section class //
        obj.public2(); // we are calling the methods by the help of the object we have declared for the class //
    }
}
