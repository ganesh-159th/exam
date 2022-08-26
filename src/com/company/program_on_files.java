package com.company;
import java.io.FileInputStream;
import java.io.File;
import java.io.EOFException;
class function67
{
    void create_file()
    {
        System.out.println("");
    }

}
public class program_on_files {
    public static void main(String[] args) {
        try {
            FileInputStream obj=new FileInputStream("example1");

            if (obj.markSupported()) {
                System.out.println("\n the file has not created :");
            } else {
                System.out.println("\n the file has been created :");
            }

        }catch( Exception e)
        {
            System.out.println(e);
        }
    }
}
