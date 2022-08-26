package com.company;
import java.util.*;

public class java_programming_array_deque {
    public static void main(String[] args) {
        System.out.println("\n welcome to the array deque :");
        ArrayDeque<Integer>name1=new ArrayDeque<Integer>();
        ArrayDeque<Integer>name=new ArrayDeque<Integer>();
        name.add(78);
        name.add(89);
        name.add(90);
        name1.addFirst(78);
        name1.add(67);
        name1.add(89);
        name1.add(90);
        name1.add(23);
        name1.addLast(90);
        name1.addAll(name);
        for(int i=0;i<name1.size();i++)
        {
            System.out.println(name1.getLast());
            System.out.println(name1.offerFirst(89));
            System.out.println(name1.getClass());
            System.out.println(name1.getLast());
        }

    }
}
