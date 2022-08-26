package com.company;
import java.io.*;

public class java_practise_program_Input_and_Output_file {
    public static void main(String[] args) {
        try {
            FileOutputStream obj=new FileOutputStream("\n test.txt");
           // int i=0;
           obj.write(159);

          //  while((i=obj.read())!=-1)

            {
               // System.out.println("char" + (char) i);
                System.out.println("\n the value si write :");
            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }

}
