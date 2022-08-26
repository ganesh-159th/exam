package sample.com;
import java.io.*;
import java.io.File;

public class java_program_on_reading_a_file {
    public static void main(String[] args) {
        try
        {
            FileInputStream obj =new FileInputStream("example.txt");
            int i= obj.read();
            System.out.println("ganesh"+(char)i);

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
