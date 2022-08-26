package com.company;
  abstract class base10
 {

     void base1()
     {
         System.out.println("\n this is the base class of the base class ");
     }
      abstract void nomination();
     {
         System.out.println("\n this is normal1 from the abstract class ");
     }

 }
  abstract class common
 {
     abstract void nomination();
     {
         System.out.println("\n the abstract class :");

     }

 }
  class base11
 {
     void nomination()
     {

         System.out.println("\n this is normal1 from the abstract class ");
     }



 }

public class java_programming_abstract{
    public static void main(String[] args) {
        base11 obj = new base11();
        obj.nomination();
        common obj1=new common() {
            @Override
            void nomination() {

            }
        };
        base10 j= new base10() {
            @Override
            void nomination() {

            }

        };


        /*

        common obj1 =new common() {
            @Override
            void nomination() {
                base11 obj =new base11();
                obj.nomination();

            }
        };

         */



    }
}
