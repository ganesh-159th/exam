package sample.com;


import java.io.FileOutputStream;

public class java_program_on_writing {
    public static void main(String[] args) {
        try{
            FileOutputStream obj= new FileOutputStream("ganesh.txt");
            obj.write(74);
            System.out.println("writing the file :"+obj);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
