package sample.com;

import java.io.FileReader;

public class file_reader {
    public static void main(String[] args) {
        try {
            FileReader obj = new FileReader("file.txt");
            obj.read();
            System.out.println("char value" + (char) obj.read());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
