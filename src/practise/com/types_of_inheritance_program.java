// inheritance is use when a base class access the properties of the parent class then that process is clas the inheritance//

package sample.com;
// single level inheritance//
class a
{
    void section ()
    {
        System.out.println("\n hey this   is the section ");
    }
}
class b extends a{
    void result()
    {
        System.out.println("\n iam the result of the all the class :");
    }
}
// multilevel inheritance//
class a1
{
    void section_1()
    {
        System.out.println("\n iam the section _1");
    }
}
class b1 extends  a1{
    void result()
    {
        System.out.println("\n so here is my result from the form :");
    }
}
class c1 extends  b1{
    void user()
    {
        System.out.println("\n iam the use of the class :");
    }
}
// multiple inheritance//
class a2
{
    void section ()
    {
        System.out.println("\n hey this   is the section ");
    }
}
class b2 {
    void result()
    {
        System.out.println("\n iam the result of the all the class :");
    }
}
// hierarchical inheritance//
class a3
{
    void ram()
    {
        System.out.println("evbf");
    }
}
class b3 extends  a3
{
    void ram1()
    {
        System.out.println("dvubf");
    }
}
class c3 extends  a3{
    void ram2(){
        System.out.println("\n sibfiybdi");
    }
}



public class types_of_inheritance_program {
    public static void main(String[] args) {
        a b= new a();
        b.section();
        b a= new b();
        a.result();
        a1 b1= new a1();
        b1.section_1();
        b1 a1= new b1();
        a1.result();
        c1 d1=new c1();
        d1.user();
        a2 b2 = new a2();
        b2.section();
        b2 a2=new b2();
        a2.result();
        a3 b3=new a3();
        b3.ram();
    }
}
