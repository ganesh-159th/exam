package com.company;
class school_collage extends Thread
{
    public  void run()
    {
        while(true)
        {
            System.out.println("\n i am the run of the school_collage");
        }
    }
}
class  collage_school extends  school_collage
{
    public void run()
    {
        while(true)
        {
            System.out.println("\n i am the run class of the collage_school");
        }
    }
}

public class practise_05 {
    public static void main(String[] args) {
        collage_school obj=new collage_school();
        obj.start();
        school_collage obj1=new school_collage();
        obj1.start();
    }
}
