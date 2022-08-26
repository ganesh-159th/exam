package sample.com;
class customer{
    int amount=1000;
    synchronized void withdraw(int a){
        System.out.println("\n the withdraw process has been started :"+a);
        if(a<amount)
        {
            System.out.println("\n the amount balance is low ");
            try
            {
                wait();
            }catch(Exception e)
            {

            }
            a-=amount;
            System.out.println("\n the withdraw process has been completed :"+a);
        }
    }
    synchronized void deposit(int b)
    {
        System.out.println("\n the deposit process has been started :"+b);
        b+=amount;
        System.out.println("\n the deposit process has been completed :");
        notify();
    }
}
public class inter_thread_communication_program {
    public static void main(String[] args) {
        final customer c = new customer();
        new Thread() {
            public void run() {
                c.withdraw(1500);
            }
        }.start();

        new Thread() {
            public void run() {
                c.deposit(1000);

            }
        }.start();
    }
}





