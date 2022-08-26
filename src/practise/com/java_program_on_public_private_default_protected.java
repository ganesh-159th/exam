package sample.com;

class modifiers{
    public int a=10;
    protected int b=90;
    int c=89;
    private int d=34;
    public  void section()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class java_program_on_public_private_default_protected {
    public static void main(String[] args) {
        modifiers c=new modifiers();
        /*
        // when we have package to be  declare in the form //
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);

         */
        // when we declare the object in with in the class then we get all the access to display the result //
        c.section();
      //  System.out.println(c.d);

    }
}
