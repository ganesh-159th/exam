package com.company;
import java.util.Scanner;
class teacher
{
   public  void  game()

    {
        System.out.println("\n i am the function of the base class :");
    }

}
class headmaster extends teacher
{

   public  void  game()// this is class function overriding //
    {
        System.out.println("\n i am th gamer of the derived class :");
    }
    public void game1()
    {
        System.out.println("\n i am the gamer1 of the derived class :");
    }
}

public class java_programming_methods_overriding_practice01 {
    public static void main(String[] args) {
        System.out.println("\n welcome ");
        Scanner sc= new Scanner(System .in);
        headmaster obj=new headmaster();
        obj.game();
        obj.game1();
        teacher obj1=new teacher();
        obj1.game();
    }

}
