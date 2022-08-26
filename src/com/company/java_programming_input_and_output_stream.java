package com.company;
import java.io.*;

//import static jdk.vm.ci.meta.JavaKind.Char;

public class java_programming_input_and_output_stream {
    public static void main(String[] args) {
        try {
         FileInputStream obj=new FileInputStream("hello.txt");
        // int i=0;
         int i= obj.read();

            while((i=obj.read())!=-1) {
                System.out.println("\n hello world"+(char) i);
            }
            obj.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
