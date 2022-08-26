package com.company;
import java.util.Scanner;
// creating a java class and writing the noun and objective and attributes //
class information
{
    int id;
    String name;
    public
    void getdata()
    {
        Scanner sc=new Scanner(System.in );
        System.out.println(("\n enter the nam eof the student :"));
        String name =sc.nextLine();
        System.out.println("\n enter the id of the student :");
        int id =sc.nextInt();



    }
    void showdata()
    {
        System.out.println("\n the id of the student is :"+name);
        System.out.println(("\n the name of the student is :"+id));

    }
}
public class creating_javaclass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n do you want to enter more information of the student :");
        int g = sc.nextInt();

        if (g == 1) {

                information obj1 = new information();
                obj1.getdata();
                obj1.showdata();

            }
        else
        {
            System.out.println("\n the end of the program :");
        }
        }
    }



