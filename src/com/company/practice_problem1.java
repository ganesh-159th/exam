package com.company;
import java.util.Scanner;
interface colum
{
    default  void merchandise  ()
    {
        System.out.println("\n enter the merchandise ");
    }
}
class section23 implements  colum
{
  int   salmon ()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n enter the name of the person :");
        String b=sc.toString();
        System.out.println("\n enter the object name :");
       String j=sc.toString();
        System.out.println("\n the enter string is :"+b+"the life of the school"+j);
        return 0;
    }

}
class section45 implements colum
{
    Scanner sc=new Scanner (System.in);
    int count_found()
       // Scanner sc=new Scanner (System.in);
    {

        System.out.println( "\n enter the number :");
       int  g=sc.nextInt();
        System.out.println("\n enter the name of the person :");

                  String u=sc.toString();


        System.out.println("\n the result is :"+g+"here is the number is :"+u);
        return 0;

    }
}

public class practice_problem1 {
    public static void main(String[] args) {
        section23 ob1=new section23();
        section45 obj=new section45();
        obj.count_found();


        obj.merchandise();
       // section23 ob1=new section23();
        ob1.salmon();

    }
}
