package com.company;
interface school1
{
    void schooltiming();
    void luchtiming ();
    default void studytiming()
    {
        System.out.println("n fomr 9:30 to 4:30 leaving time ");
    }

}
class information1 implements school1
{
    @Override
    public void luchtiming() {
        System.out.println("\n from 12:40 to 1:10");
    }

    @Override
    public void schooltiming() {
        System.out.println("\n from 7:30 to 5:30 for 10th class student");
    }


}

public class java_programming_default_interface {
    public static void main(String[] args) {
        information1 obj1=new information1();
        obj1.luchtiming();
        obj1.studytiming();
        obj1.schooltiming();
    }
}
