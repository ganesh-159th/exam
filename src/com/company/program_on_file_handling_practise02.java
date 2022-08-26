package com.company;
import java.io.File;
import java.util.*;
import java.util.Scanner;
import java.io.*;

public class program_on_file_handling_practise02 {
    public static void main(String[] args) {
        // for CREATING A NEW FILE IN THE PROGRAM//
        /*
        System.out.println("\n welcome ");
        try
        {
            File obj=new File("example2.txt");
            obj.createNewFile();
            System.out.println("\n you are file has been CREATED :");

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }

         */
// write a java program for reading  a content for the given file //
        /*
        try {
            FileWriter obj = new FileWriter ("example2.txt");
            obj.write("\n hey  this is ganesh :");
            obj.close();

        }catch(Exception e)
        {
            e.printStackTrace();
        }

         */
        //write a java program to read the file //
        /*
        try
        {
            File obj =new File("example2.txt");
            Scanner sc= new Scanner (obj);
            while(sc.hasNextLine())
            {
                String line =sc.nextLine();
                System.out.println(line);
            }


        }catch(Exception E)
        {
            E.printStackTrace();
        }

         */



    }
}
