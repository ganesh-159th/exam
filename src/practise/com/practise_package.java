// writing the sample java program //
package sample.com; //package section//

import java.util.*; //import section //
import java.util.Scanner; // import section in this we have selected the specified one class//

public class practise_package { // main class //
    public static void main(String[] args) { // main clas method implementation //
        Scanner sc=new Scanner(System.in);
        System.out.println("\n enter the two number number :");
        int a=sc.nextInt(); //declare the as the int value //
        int b= sc.nextInt();
        int c=a+b; // the sum of the two number is given //
        System.out.println("\n the sum of the two number is :"+c);


    }
}
