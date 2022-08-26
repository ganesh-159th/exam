package com.company;

import java.util.Scanner;

public class specific_exception {
    public static void main(String[] args) {
        int []a = new int[4];
        a[0] = 90;
        a[1] = 190;
        a[2] = 890;
        a[3] = 690;
        Scanner sc = new Scanner(System.in);
        System.out.println(("\n enter the array index  :"));

        int g = sc.nextInt();
        System.out.println("\n enter the number in the array index ");
        int y=sc.nextInt();

        try {
            System.out.println("\n the value is :" + a[g]);
            System.out.println("\n enter the value do you want to divide  " + a[g] /y);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\n some ArrayIndexOutOfBoundsException error has been Occurred " + e);
        }
        catch (Exception e)
        {
            System.out.println("\n sum exception has been occurred in the given block "+e);
        }



    }
}

