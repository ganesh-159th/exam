package com.company;



class method1
{
    public void method()
    {
        System.out.println("\n  the method of the function is called from the base class :");
    }
}
class uniform extends method1
{
   public void method()
    {
        System.out.println("\nt he function is  overriding from the base function :");
    }
    void method2()
    {
        System.out.println("\n the function is from  the derived class  ");
    }
}

public class java_method_overriding {
    public static void main(String[] args) {
        uniform name =new uniform();
        name .method();
        name.method2();




    }
}
