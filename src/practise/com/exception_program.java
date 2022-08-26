package sample.com;


import java.util.Scanner;

public class exception_program {
    public static void main(String[] args) throws age  {
        try
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("\n enter the age of the child :");
            int age=sc.nextInt();
            if(age>18)
            {
                System.out.println("\n you can  ride the roller ride:");
            }else {
                throw new ArithmeticException("\n the child is not allow in this ride :") ;
            }

        }catch(Exception e)
        {
            System.out.println("\n you're child is not allow in this ride :");


        }

    }
}
