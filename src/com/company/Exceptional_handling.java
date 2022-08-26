package com.company;
import java.util.*;


public class Exceptional_handling {


    public static void main(String[] args) throws Exception {

        int c1 = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n enter the number :");
            int a = sc.nextInt();
            int b = sc.nextInt();
            float c = a / b;
            System.out.println("\n the answer is " + c);
            c1 = a - b;
            System.out.println("\n the difference is of the two numbr is :"+c1);


        } catch (Exception c) {

            System.out.println("\n if you given the denominator as zero you have a exception " + c);


        }

    }
}



