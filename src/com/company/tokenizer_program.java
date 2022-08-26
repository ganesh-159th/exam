package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.*;



public class tokenizer_program {
    public static void main(String[] args) {


        String b = "thesizeofthegameisname";
        StringTokenizer d = new StringTokenizer(b, "");
        System.out.println("\n the tokenizer are :");
        while(d.hasMoreTokens())
        {
            String c= d.nextToken();
            System.out.println(c);
        }
    }

}
