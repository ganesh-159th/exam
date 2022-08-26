package com.company;
import java.util.*;
interface data
{
    int a=100;
}
interface method extends data
{
    void values();
}
class example1 implements  method,data
{

    @Override
    public void values() {
        System.out.println("\nthe value of a is :"+a);
    }
}

public class java_program_example1 {
    public static void main(String[] args) {
        example1 obj1=new example1();
        obj1.values();
    }
}
