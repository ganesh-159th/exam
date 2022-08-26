package sample.com;
class section extends  Thread
{
    public  void run()
    {
        while(true)
        {
            System.out.println("\n hi this is ganesh:");
        }
    }
}
class section_01 extends  Thread
{
    public  void run()
    {
        while(true)
        {
            System.out.println("\n iam ganesh :");
        }
    }
}


public class thread {
    public static void main(String[] args) {
        section obj = new section();
        obj.start();
        section_01 obj1= new section_01();
        obj1.start();
        obj.setPriority(Thread.MAX_PRIORITY);
        obj1.setPriority(Thread.NORM_PRIORITY);

    }
}
