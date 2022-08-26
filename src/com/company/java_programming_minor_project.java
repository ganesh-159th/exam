package com.company;

import java.util.Scanner;

interface phone1
{
    void off();
    void on();
    void full_volume();
    void minimum_volume();
}
interface  camara
{
    void on_camera_application();
    void off_camera_application();
    void on_flash_mode();
    void off_flash_mode();

}
interface front_camara {
    void front_camara_mode_is_on_state();
    void front_camara_mode_is_off_state();

}
interface  speaker
{
    void on_speaker();
    void off_speaker();

}
abstract class smart_phone implements call,camara,speaker,phone1
{
    Scanner sc=new Scanner(System.in);
    /*

    @Override
    public int received() {


        System.out.println("\n enter do you want to receive the call : ");
        String a=sc.toString();
        if(a == "yes")
        {
            System.out.println("\n you have received the call from and it has been  recoded in the database :");

        }
        else
        {

        }

        return 0;
    }

    @Override
    public void declined() {
        System.out.println("\n do you want to declined the call :");
        Scanner sc= new Scanner(System.in);
        String g=sc.toString();
        if(g=="yes")
        {
            System.out.println("\n you're call has been declined :");
        }

    }

     */

    @Override
    public void off() {
        int h= sc.nextInt();
        if(h==0)
        {
            System.out.println("\n you're phone is in off state :");
        }

    }

    @Override
    public void on() {
        int j=sc.nextInt();
        if(j==1)
        {
            System.out.println("\n the given system is in on state :");
        }
    }

    @Override
    public void full_volume() {
        System.out.println("\n do you want to increase the volume :");
        String F=sc.toString();
        if(F=="full")
        {
            System.out.println("\n the volume is in full state :");
        }

    }

    @Override
    public void minimum_volume() {
        System.out.println("\n do you want to decrease the volume :");
        String h=sc.toString();
        if(h=="mini")
        {
            System.out.println("\n the volume is decreased state :");
        }

    }

    @Override
    public void on_camera_application() {
        System.out.println("\n do you want to on the camera state :");
        String h=sc.toString();
        if(h=="on_the application")
        {
            System.out.println("\n you're in the camera application state :");
        }
    }

    @Override
    public void off_camera_application() {
        System.out.println("\n the camara is in the off state :");


    }

    @Override
    public void on_flash_mode() {
        System.out.println("\n flash is in on state :");

    }

    @Override
    public void off_flash_mode() {
        System.out.println("\n flash is in off state :");

    }

    @Override
    public void on_speaker() {
        System.out.println("\n speaker is in on  mode :");

    }

    @Override
    public void off_speaker() {
        System.out.println("\n speaker is in the off state :");

    }
}

public class java_programming_minor_project {
    public static void main(String[] args) {
    phone1 obj1= new smart_phone() {
        @Override
        public int received() {
            return 0;
        }

        @Override
        public void declined() {

        }
    };
camera1 obj2= new phone();




    }
}
