package sample.com;
class run implements  Runnable
{

    @Override
    public  synchronized void run() {
        while(true)
        {
        System.out.println("\n run the function until it is not in the use ");

    }
}
class form   implements  Runnable
{
    @Override
    public void run() {
        while(true)
        {
            System.out.println("\n i am the second runnable method that is implemented by the form :");
        }
    }
}


 public class synchronization {
    public  static void main(String[] args) {
        run obj = new run();
        Thread a= new Thread(obj);


        a.start();

    }
}
}
