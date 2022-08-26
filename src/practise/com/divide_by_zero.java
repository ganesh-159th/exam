package sample.com;

import java.util.Scanner;
import java.io.EOFException;




public class divide_by_zero {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n enter two number :");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c=a/b;
            System.out.println("\n the answer is :"+c);

            }catch(Exception e)
            {
                {
                    System.out.println("\n you have got the exception :" + e);
                }
            }


    }
}
