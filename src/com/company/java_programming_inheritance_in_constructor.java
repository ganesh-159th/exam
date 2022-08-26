package com.company;
class home
{
    int home()
    {

        System.out.println("\n i am the constructor of the base class :");
        return 0;
    }
}
class parent extends  home
{
    parent()
    {
        System.out.println("\n the i am the constructor of the derived class :");
        System.out.println(super.home());
    }


}
public class java_programming_inheritance_in_constructor {
    public static void main(String[] args) {
        parent obj=new parent();

    }
}
