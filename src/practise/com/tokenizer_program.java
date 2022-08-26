package sample.com;

import java.util.StringTokenizer;

public class tokenizer_program {
    public static void main(String[] args) {
        StringTokenizer d1 = new StringTokenizer("\n the sum of the two number is going to set the school :");
        while (d1.hasMoreTokens()) {
            System.out.println(d1.nextToken());
        }
    }
}
