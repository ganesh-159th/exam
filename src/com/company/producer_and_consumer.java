package com.company;
class q
{
    int n;
    synchronized void put(int a)
    {
        a=n;
        System.out.println(a);
    }
    synchronized int get()
    {
        System.out.println("got"+n);
        return 0;

    }
    class producer implements  Runnable
    {
        q Q;
        producer( q a)
        {
            a=a;
            new Thread(a+"producer").start();
        }

        @Override
        public void run() {
            int i=0;
            while(true)
            {
              Q.put(i++);
            }

        }
    }
    class consumer implements Runnable
    {
        q Q;
        consumer( q b)
        {
            b=b;
             new Thread(b+"consumer").start();

        }
       public  void run()
        {
            int i=0;
            while(true)
            {
                Q.get();
            }

        }
    }

    public static void main(String[] args) {
        q g= new q();


    }
}


