package com.company;
class myexceptionclass extends Exception

{
    @Override
    public String getMessage() {
        return getMessage( )+"the exception has been occurred in the given program :";
    }


    }
    class exception1 extends myexceptionclass

    {
        @Override
        public String toString() {
            return toString()+"\n the given block is in the exception in the given block ";
        }
    }
public class java_programming_Exception_class {
    public static void main(String[] args) {
        try
        {
          throw new myexceptionclass();

        }
        catch (myexceptionclass e) {
            System.out.println("\n the exception has been occurred in the given Syntax ");
            System.out.println(e.getMessage());
            System.out.println(e.toString());


        }
    }
}
