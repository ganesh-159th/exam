// a constructor is used when we not want to use the object for the class then we can se the constructor and constructor does not return any value //
package sample.com;
class my_constructor{
    my_constructor() // default constructor //
    {
        System.out.println("\n as you can se this is called as the constructor :");
    }
    int a;
    int b;

    my_constructor(int a,int b) // parameter constructor//
    {
        this.a=a;
        this.b=b;
        int c=a+b;
        System.out.println("\n c"+c);
    }
}



public class constructor_program {
    public static void main(String[] args) {
     new my_constructor();
     new my_constructor();
     new my_constructor(6,7);
    }
}
