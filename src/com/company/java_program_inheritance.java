package com.company;
import java.util.Scanner;


    class multiplication {

       public  void   j(int x,int y)
        {
            int z;
            z=x*y;

            System.out.println(("\n hay this this bass class :"));
            System.out.println(("\n calculate the sum of the two number and write the answer for the given question "+z));
        }
    }
    class multiplication1 extends multiplication
    {
       public  void l(int u)
        {
            int o=56087;
            int k=o*u;
            System.out.println(("\n this this derived class :"));
            System.out.println(k);
        }
    }
    public class java_program_inheritance {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System .in);
            System.out.println(("\n enter the a,b values"));
            int a=sc.nextInt();
            int b=sc.nextInt();

            multiplication1 obj = new multiplication1 ();
            obj.j(a,b);
            System.out.println(("\n the result is:"+obj));
            multiplication1 obj1= new multiplication1();
            System.out.println(("\n enter the h value :"));
            int h=sc.nextInt();
                    obj1.l( h);
            System.out.println(("\n the result is "+obj1));


        }
    }

