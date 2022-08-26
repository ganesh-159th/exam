package sample.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class name implements  java.io.Serializable
{
    public int a;
    public String b;
    void  A(int a,String b)
    {
        this.a =a;
        this.b=b;

    }

}
public class serializable {
    public static void main(String[] args) {
        name obj= new name();
        obj.A(1,"ganesh");
        try
        {
            FileOutputStream obj1=new FileOutputStream("section.txt");

            obj1.close();

            System.out.println("\n the file is serializable:");
        }catch(IOException e)
        {
            System.out.println(e);
        }

        try
        {
            FileInputStream obj2 = new FileInputStream("section.txt");
            ObjectInputStream obj3= new ObjectInputStream(obj2);
            obj3.close();
            obj2.close();
            System.out.println("\n this is not serializable:");
        }catch(Exception e)
        {
            System.out.println(e);

        }


    }
}
