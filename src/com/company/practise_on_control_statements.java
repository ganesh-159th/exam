package com.company;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class practise_on_control_statements {
    public static void main(String[] args) {


    /*
    in control statements we have three types of statements
    1. conditional statement(if,if else,else if ,switch);
    2. loop statement (for,while,do while );
    3. jump statement (goto,continue );
     */
        //conditional statements
        // System.out.println("\n the age of the given number is :");
        // int a=90;
        System.out.println("\n enter the age group of the person ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a <= 90) {
            System.out.println("\n the age fo the person is below 90");
        } else if (a > 90 || a < 100) {
            System.out.println("\n the age people is lied between the 90 to 100 ");
        } else {
            System.out.println("\n the aged people are kids");
        }


        for (int i = 0; i < 5; i++) {
            System.out.println("\n enter the age of the person");
            int a1=sc.nextInt();
            if (a1 <= 90) {
                System.out.println("\n the age fo the person is below 90");
            } else if (a1 > 90 || a1 < 100) {
                System.out.println("\n the age people is lied between the 90 to 100 ");
            } else {
                System.out.println("\n the aged people are kids");
            }

        }
    }


}
