package com.company;
interface songs
{
    void goodsongs ();
    void badsongs();
    void highpitch();
    void lowpitch();


}
class moives1 implements songs {


    public void goodsongs() {
        System.out.println("\n for the good songs ");

    }

    @Override
    public void badsongs() {
        System.out.println("\n for the bad songs ");

    }

    @Override
    public void highpitch() {
        System.out.println("\n for the high pitch songs");


    }

    @Override
    public void lowpitch() {
        System.out.println("\n for the low pitch songs ");

    }
}




public class java_programming_interfaces {
    public static void main(String[] args) {
        moives1 obj=new moives1();
        obj.badsongs();
        obj.goodsongs();
        obj.highpitch();
        obj.lowpitch();






    }

}
