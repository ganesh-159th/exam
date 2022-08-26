package com.company;
import java.util.Scanner;
class calculator8
{
    void sum()
    {
        int a=10,b=20;
        System.out.println("sum"+(a+b));
    }
    void sum(int b,int k)// method over loading //
    {
        int g=b+k;
        System.out.println("sum1\n "+g);

    }
}
class calculator9 extends calculator8
{
    void sum()//function overriding //
    {
        int a=90,b=69;
        System.out.println("sum"+(a+b));
    }
}

public class java_overriding_and_exception {
    public static void main(String[] args) {
        try {
            Scanner g = new Scanner(System.in);
            System.out.println("\n enter the two number of the operation :");
            int b = g.nextInt();
            int k = g.nextInt();
            if (b == 0 && k <= 90) {
                //  Scanner g= new Scanner(System.in);
                calculator9 obj = new calculator9();
                System.out.println("\n enter the two number of the operation :");
                b = g.nextInt();
                k = g.nextInt();
                obj.sum(b, k);
                obj.sum();
            }
        } catch
         (Exception e) {
            e.printStackTrace();
        }
    }
}

