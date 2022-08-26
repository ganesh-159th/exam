




package add;
import java.util.Scanner;

import java.util.*;
class addition
{
    double a=9.00,b=56.788;
    int add(int a,int b)
    {
        this.a=a;
        this.b=b;
        return (a+b);
    }
}
public class java_programming_package_implementation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        addition obj=new addition();
        System.out.println("\n enter the two numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        obj.add(a,b);
        System.out.println("\n the sum of the two number is :"+(obj.add(a,b)));


    }
}
