package sample.com;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class program_on_input_output {
    public static void main(String[] args) {
        try
        {
            FileWriter obj = new FileWriter("form.txt");
            String S= "ganesh";
            obj.write(S);
            System.out.println(""+obj);


        }catch(Exception e)
        {
            System.out.println(e);

        }
    }
}
