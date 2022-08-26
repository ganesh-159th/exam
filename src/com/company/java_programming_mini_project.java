package com.company;
import java.util.*;
interface call
{
    int received();

   void declined ();
}
interface music extends call
{
    void list_of_songs();
    void delete ();


}
interface camera1 extends  music
{
    void HD_video();
    void turn_on();
    default void turn_off()
    {
        turn_off();
        {
            System.out.println("\n enter the input :");
            Scanner sc=new Scanner(System.in);
            String c=sc.toString();
            if(c == "yes")
            {
                System.out.println("\n the camera is in off_state :");

            }
            else if(c=="no")
            {
                System.out.println("\n is in on state :");

            }

        }

    }

}

class phone implements camera1
{


    @Override
    public int received() {
        System.out.println("\n the phone has received ");

        return 0;
    }

    @Override
    public void declined() {
        System.out.println("\n the call has been declined from some reason ");

    }

    @Override
    public void list_of_songs() {
        System.out.println("\n all the songs details can be found in this page if you want to check the more ");

    }

    @Override
    public void delete() {
        System.out.println("\n the selected song has been deleted ");

    }

    @Override
    public void HD_video() {
        System.out.println("\n the HD_video has been accessed you can switch to this mood ");
    }

    @Override
    public void turn_on() {
        System.out.println("\n the camera is on on state ");
    }

    @Override
    public void turn_off() {
        System.out.println("\n the camera is in off_state :");
    }
}


public class java_programming_mini_project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n  do you want to access the object of the phone :");
        int  c = sc.nextInt();
        switch (c) {
            case 1:
                phone obj = new phone();
                obj.turn_on();
                // obj.declined();
                obj.turn_off();
                obj.delete();
                obj.HD_video();
                // obj.received();
                obj.delete();
                obj.list_of_songs();

                break;

            case 2: {

                System.out.println("\n this is all the list of the only the call list :");
                call obj1 = new phone();
                obj1.declined();
                obj1.received();
                break;
            }
            case 3: {
                System.out.println("\n in this et all are the set of music in this :");

                music obj2 = new phone();
                obj2.delete();
                obj2.list_of_songs();
                break;
            }
            case 4:
            {
                System.out.println("\n in this you can find the mode of the camera which provides the facilities ");
                camera1 obj3 = new phone();
                obj3.HD_video();
                obj3.turn_on();
                obj3.turn_off();
                break;
            }
        }
    }
}


