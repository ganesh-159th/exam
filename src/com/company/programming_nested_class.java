package com.company;
class section56 {
    static class doodle{
        char function (){
            System.out.println("\n  the  function chapter is in the c++ concept :");
            return 0;
        }
        char  function2 ()
        {
            System.out.println("\n this is the function of the section 56 and this is  something based on the class :");
            return 0;
        }
    }
}
interface section_E {
    void google();
 interface section_n{
        default void output(){
            System.out.println("\n the section of the class is going to  show the surface  tension of the given form :");
        }
    }

}
class do_not_know implements section_E.section_n{
    @Override
    public void output() {
        System.out.println("\n here is hte function nme which is going to excute from the school:");

    }

   // @Override
    public void google() {
        System.out.println("\n hey here i am using the function key word :");
    }
}
class games56 extends section56
{
    void series()
    {
        System.out.println("\n the name of the person is in the class only :");
    }
    char function (){
        System.out.println("\n this the second form from the user input  :");
        return 0;
    }
    char function2 ()
    {
        System.out.println("\n the nested class function and there user :");
        return 0;
    }

}




public class programming_nested_class {
    public static void main(String[] args) {
        games56 obj= new games56();
        section56.doodle obj5= new section56.doodle();
        do_not_know obj7=new do_not_know();
        obj7.google();
       obj7.output();
       obj5.function();
        obj5.function2();
       obj.function();
       obj.function2();
        obj.series();

    }
}
