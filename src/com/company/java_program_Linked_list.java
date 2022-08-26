package com.company;
import java.util.*;

import java.util.LinkedList;

public class java_program_Linked_list {
    public static void main(String[] args) {
        LinkedList<Integer>number=new LinkedList<>();
        LinkedList<Integer>number2=new LinkedList<Integer>();
        number2.add(78);
        number2.add(89);
        number2.add(90);
        number2.add(5687);
        number.add(0,678);
        number.add(1,788);
        number.add(2,908);
        number.add(3,13378);

        for(int i=0;i<number.size();i++)
        {
            System.out.println(number.get(i));
        }


    }
}
