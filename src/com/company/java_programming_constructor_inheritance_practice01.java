package com.company;
import java.util.Scanner;
class base1
{
  base1()
  {
      System.out.println("\n hey, their this is function  fo the base class ");
  }
  base1(int x)
  {
      int z=x;
      System.out.println("\n the base class value is :"+x);

  }
}
class base2 extends base1
{  base2()
{
    super(89);  // super keyword
    System.out.println("\n i am the function of the derived class ");
}
 base2(int x,int y)
{
    System.out.println("\n the number of the derived from the second derived class and the value of the x"+x);
    System.out.println("\n the number of the derived form the second derived class and the value of y is :"+y);
}

}
class base3 extends base2
{
    base3() {
        super(56, 78); //super keyword
        System.out.println("\n the element of the base class is :");
    }
}

public class java_programming_constructor_inheritance_practice01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        base3 obj=new base3();
        base obj1=new base();
        base2 obj2=new base2();

    }
}
