package com.company;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class java_file_program {
    public static void main(String[] args) {
        // to create a file //
        /*
        File obj=new File("example1.txt");
        try {
            obj.createNewFile();

        }catch(Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }

         */
        // to write the content inside the file //
        /*
        try {
            FileWriter obj=new FileWriter("example1.txt");
            obj.write(" this is ganesh");
            obj.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

         */
// write inside the file //
        try {
            File obj = new File("\n example2.txt");
            Scanner sc = new Scanner(System.in);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}

