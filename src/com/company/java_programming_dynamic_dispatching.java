package com.company;
class a
{
    public void school()
    {
        System.out.println("\n i am the function  of hte base class :");
    }
}
class b extends a
{
    public void school()
    {
        System.out.println("\n i am the function of the derived class which has been overriding ");
    }
    public void information ()
    {
        System.out.println("\n i am the function of the derived class :");
    }
}

public class  java_programming_dynamic_dispatching{
    public static void main(String[] args) {
      //  a obj1 =new a();
       // obj1.school();

       b obj =new b();
        obj.information();
        obj.school();

     //a name=new b();
      //  name.school();


    }

}
