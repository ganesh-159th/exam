package com.company;
import java.util.Scanner;
class base
{
     base ()
    {
        System.out.println("\n  i am from the base class :");
    }
    base(int x)
    {
        System.out.println("\n i am fomr the base class :"+x);
    }
}
class derived extends base
{
     derived()
    {
        super(90);
        System.out.println("\n i am  from the derived class :");
    }
    derived(int u,int y)
    {
        System.out.println("\n the one number is belongs ot the derived class :"+u);
        System.out.println(("\n the secound number  is belongs to the derived class :"+y));
    }
}
class school extends derived{
    school()
    {
        super(78,90);
        System.out.println(("\n the sub class fomr the deirved class :"));
    }
}
public class java_program_constructor_inheritance {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System .in);

       // base b=new base();


        derived d =new derived();
        school g=new school();




    }
}