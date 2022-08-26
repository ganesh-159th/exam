package com.company;
class calculation13
{
    int area(int a,int b)
    {
        int h=a+b;
        return h;
    }
    int area(int a,int b,int c)
    {
        int g=a+b*c-c;
        return g;
    }

}
class animal
{
    int  dog()
    {
        System.out.println("\n hey hi it's me :");
        return 1;
    }


}

class overall_animal extends animal
{
    int dog()
    {
        System.out.println("\n i am from the zoo which is second dog:");
        System.out.println(super.dog());
        return 1;
    }
}

public class java_super_class_usage {
    public static void main(String[] args) {
      //  overall_animal obj1=new overall_animal();
     //  obj1.dog();
      animal obj2= new overall_animal();
     obj2.dog();
      calculation13 obj3=new calculation13();
        System.out.println(  "\n the calculation part of the give sum is :"+obj3.area(3,4));
        System.out.println( "\n the calculation part is found in the given list :"+obj3.area(4, 5, 7 ));



    }
}
