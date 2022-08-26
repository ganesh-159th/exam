package com.company;
import javax.crypto.spec.PSource;
import javax.swing.*;
import java.util.Scanner;
interface shorts
{
    void football();
    void basketball();
}
interface food
{
  void egg();
  void vegetables();
  void fruits();
}
interface game
{
    void sports_video_games();
    void adventure();
}
interface healthy_food
{
    void avocado();
    void beans();
}
interface book
{
    void fantasy();
    void mystery();
}
class collection5 {

    public static Object shop;
    public static object shop1;
    public static  object shop3;
    public static  object shop5;
    public static  object shop2;

    class shop1 extends collection5 implements shorts
        {

            @Override
            public void football() {
                Scanner sc=new Scanner(System.in);
                System.out.println("\n how many players are there in this football game");
                int g=sc.nextInt();
                System.out.println("\n welcome to the game zone:"+g);
            }

            @Override
            public void basketball() {
                Scanner sc=new Scanner(System.in);

                System.out.println("\n how many players are there in this basketball game");
                int h=sc.nextInt();
                System.out.println("\n welcome th the games zone:"+h);



            }
        }
        class shop extends collection5 implements healthy_food
        {

            @Override
            public void avocado() {
                System.out.println("\n this is avocado and you can have this fruits  which is good for the body :");

            }

            @Override
            public void beans() {
                System.out.println("\n beans is also comes under the healthy _food and we can have this food for the healthy ");

            }
        }
        class shop2 extends collection5 implements food
        {

            @Override
            public void egg() {
                System.out.println("\n this is some this is good to take the food and make the body strong :");

            }

            @Override
            public void vegetables() {
                System.out.println("\n vegetables is also one of the think we should actually take this this thing :");

            }

            @Override
            public void fruits() {
                System.out.println("\n fruits is good for the body :");

            }
        }
        class shop5 extends collection5 implements book
        {

            @Override
            public void fantasy() {
                System.out.println("\n this is the boos sector and in this book sector we have to see the  thing and make the thing :");
            }

            @Override
            public void mystery() {
                System.out.println("\n mystery is one of the food zone and have this foo zone is use full for the healthy diet:");

            }
        }
        class shop3 extends collection5 implements  game
        {

            @Override
            public void sports_video_games() {
                System.out.println("\n we have types of games in the give form and make the form in the good format to use it :");
            }

            @Override
            public void adventure() {
                System.out.println("\n you should go to the adventure games ");

            }
        }


    }






public class java_program_on_shop_items   {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        collection5 obj=new collection5();

        System.out.println("\n welcome to the store:");
        System.out.println("\n do you like to order something !!!");
       int u=sc.nextInt();
        if(u==1)
        {



            System.out.println("\n here we have some sectors please section the section :");
            System.out.println("\n 1.sports 2.food_items 3.game zone 4.healthy_food 5.book's");
            System.out.println("\n please section the option from the given menu ");
            int h=sc.nextInt();

            switch(h)
            {


                case 1:
                    Object shop = collection5.shop;
                    break;
                case 2:
                    object shop1=collection5.shop1;
                    break;
                case 3:
                    object shop3=collection5.shop3;
                case 4:
                    object shop2=collection5.shop2;
                case 5:
                    object shop5=collection5.shop5;
            }
        }
        else
        {
            System.out.println("\n thank you for visiting the store :");
        }

    }






}
