package com.company;
import java.util.Scanner;
interface number
{
    int integer=100;
    float decimal=89.90f;
    double rational=90.67;

    //  void number ();


    //  void number ();
   default int  sum(int a,int b)
    {
        int h=a+b;
        return h;

    }

}


public class java_program_variable_in_interface implements number {
    public static void main(String[] args) {



        System.out.println(integer);
        System.out.println(decimal);
        System.out.println(rational);

    }
}
