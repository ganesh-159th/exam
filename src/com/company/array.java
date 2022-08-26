package com.company;
import com.sun.security.jgss.GSSUtil;

import javax.swing.*;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        /*
        if(c>45)
        {
            System.out.println("\n the sizeof the array is ");
            System.out.println(c);
        }
        else if (c>67)
        {
            System.out.println(("\n the size of the array is "));
            System.out.println(c);
        }
        else
        {
            System.out.println("\n infinity loop is going ");
            System.out.println(c);
        }

         */
        /*
        Scanner sc=new Scanner(System .in);
        System.out.println("\n the elements are ");
        int a[]={34,56,78,90,23};
   //
        System.out.println(a[0]);
        System.out.println(a[3]);
        System.out.println(a[4]);

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println(("\n end of the loop "));



         */
        int a[][];
        a=new int [3][3];
        a[0][0]=101;
        a[0][1]=102;
        a[0][2]=103;
        a[1][0]=201;
        a[1][1]=202;
        a[1][2]=203;
        a[2][0]=301;
        a[2][1]=302;
        a[2][2]=303;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.println(a[i][j]);
                System.out.println(" ");
            }

        }
        System.out.println("\t ");
    }
    }

