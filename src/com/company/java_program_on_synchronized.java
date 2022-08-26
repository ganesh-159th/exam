package com.company;
class section_02 extends Thread{
    public void run ()
    {
        int i=0;

        while(i<99)
        {
            System.out.println("hello");
        }
    }
}
class section_01 extends section_02{
    @Override
    public void run() {
     int i=0;
     while(i<100)
     {
         System.out.println("hey");
     }
    }
}

public class java_program_on_synchronized {
    public static void main(String[] args) {
        section_02 obj= new section_02();
        obj.run();
        section_01 obj1=new section_01();
        obj1.run();
    }
}

