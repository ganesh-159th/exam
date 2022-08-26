package sample.com;
//  example for overloading //
 class ram
{
    int a,b;
    void run ()
    {
        System.out.println("\n this is am :");
    }
    void run(int a, int b)
    {
        this.a=a;
        this.b=b;
        int c= a+b;
        System.out.println(c);

    }
    void run(String c)
    {
        String g=c;
        g="ganesh";
        System.out.println(g);

    }
}
class game {

     int  run(int a)
     {
         System.out.println(a);
         return a;
     }
}
class game_1 extends game{
     boolean run()
     {
         System.out.println("\n  my name is ganesh :");

         return false;
     }
     void run_1()
     {
         System.out.println(super.run(7));

     }
}

public class program_on_overloading_overriding {
    public static void main(String[] args) {
        ram obj= new ram();
        obj.run();
        obj.run(6,7);
        obj.run("ganesh");
        game_1 ob1=new game_1();
        ob1.run();
        ob1.run(78);
        ob1.run_1();
    }
}
