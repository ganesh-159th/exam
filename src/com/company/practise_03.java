package com.company;


import java.io.File;
import java.io.*;
import java.util.Scanner;

public class practise_03 {
    public static void main (String []args ) {
        //creating a new file //
        /*

        try {

            File obj = new File("example3.txt");
            obj.createNewFile();

        } catch (Exception e)
        {
            e.printStackTrace();
        }

         */


        //program on writing a file //
        /*

        try {
            FileWriter obj= new FileWriter("example3.txt");
            obj.write("\n i ma ganesh and i going to teach you the meaning full language ");
            obj.close();

        }catch(Exception r)
        {
            r.printStackTrace();
        }
*/


        //java program on reading a file //

        try {
            File obj=new File("example3.txt");
            Scanner sc= new Scanner(obj);
            while(sc.hasNextLine())
            {
                String line =sc.nextLine();
                System.out.println(line );
            }
        }catch(Exception E)
        {
            E.printStackTrace();
        }





    }

}
