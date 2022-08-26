package com.company;
class object
{
    object()
    {
        System.out.println("\n this is the object type constructor :");
    }
}
class object1 extends object
{
    object1()
    {
        System.out.println("\n this is the constructor in the inside the derived class constructor :");
    }
}



public class program_on_constructor_class {
    public static void main(String[] args) {
        object1 obj=new object1();
        object1 object1=new object1();
        object1 obj2=new object1();
        object1 obj3=new object1();



    }
}
