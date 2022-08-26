package com.company;
interface camera
{
    void hdvideo();
    void onthecamera();
    void offthecamera();
}
interface gps extends camera // this is called the inheritance of the interface //
{
    void opengps();
    void locationingps();
}


class cellphone
{
    void calling()
    {
        System.out.println("\n the calling process is gone on ");
    }
    void offcellphone()
    {
        System.out.println("\n the power is off in the cellphone");
    }
    void phonenumber()
    {
        System.out.println("\n phonenumber list :");
    }
}
class smartphone extends cellphone implements camera,gps
{

    @Override
    public void hdvideo() {
        System.out.println("\n you're in the hd mode ");

    }

    @Override
    public void onthecamera() {
        System.out.println("\n you have on the camera");

    }

    @Override
    public void offthecamera() {
        System.out.println("\n you have turnoff the camera");

    }

    @Override
    public void opengps() {
        System.out.println("\n the Navigation system in active state:");

    }

    @Override
    public void locationingps() {
        System.out.println("\n the location has be register in the given location ");

    }
}

public class java_programming_interface_inheritance {
    public static void main(String[] args) {
        smartphone obj=new smartphone();// this object can access all the object
        obj.hdvideo();
        obj.locationingps();
        obj .opengps();


        cellphone obj1=new smartphone(); // Polymorphism //
        obj1.phonenumber();
        obj1.offcellphone();
        obj1.calling();
    }
}
