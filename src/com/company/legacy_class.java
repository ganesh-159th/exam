package com.company;


import java.util.*;
import java.util.Vector;

public class legacy_class {
    public static void main(String[] args) {
        Hashtable<String,Integer>c= new Hashtable<>();
        Stack<String>g=new Stack<>();
        Properties c1= new Properties();
        Vector<Integer> C2=new Vector<>();
        c.put("ganesh0",78);
        c.put("ganesh0",78);
        c.put("ganesh0",78);
        c.put("ganesh0",78);
        c.put("ganesh0",78);
        c.put("ganesh0",78);
        System.out.println(c);
        g.push("Ganesh");
        g.push("Ganesh");

        g.push("Ganesh");
        g.push("Ganesh");
        g.push("Ganesh");
        System.out.println(g);
        c1.put(67,"ganesh");
        c1.put(67,"ganesh");
        c1.put(67,"ganesh");
        c1.put(67,"ganesh");
        System.out.println(c1);
        /*
        C2.add(01,3);
        C2.add(02,4);
        C2.add(03,53);
        C2.add(04,45);
        C2.add(05,43);
        System.out.println(C2);

         */

        Dictionary<Integer,String>g1=new Dictionary<Integer, String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public Enumeration<Integer> keys() {
                return null;
            }

            @Override
            public Enumeration<String> elements() {
                return null;
            }

            @Override
            public String get(Object key) {
                return null;
            }

            @Override
            public String put(Integer key, String value) {
                return null;
            }

            @Override
            public String remove(Object key) {
                return null;
            }
        };


    }
}
