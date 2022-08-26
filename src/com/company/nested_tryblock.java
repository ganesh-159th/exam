package com.company;

import java.util.Scanner;

public class nested_tryblock {
    public static void main(String[] args) {
        int a[]=new int[5];
        a[0]=1;
        a[1]=67;
        a[2]=90;
        a[3]=78;
        a[4]=11;
        Scanner sc=new Scanner(System .in);
        System.out.println("\n enter the index of the array :");
        int g=sc.nextInt();
        System.out.println("\n enter the number of the given size of the array :");
        int h=sc.nextInt();

        try{

            System.out.println(a[g]/h);
            try {
                System.out.print("\n ");
                System.out.println(a[g]);

            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("\n  ArrayIndexOutOfBoundsException has been occurred :");

            }

        }catch(Exception e)

        {
            System.out.println("\n the exception has been occurred ");
        }

    }
}
