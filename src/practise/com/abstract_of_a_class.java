package practise.com;
abstract class form_02
{
    abstract void run();
    abstract void run_01();


}
class form_01 extends   form_02 {

    @Override
    void run() {
        System.out.println("\n i  have implemented the class :");
    }

    @Override
    void run_01() {

        System.out.println("\n the name of the class is :");
    }
}

public class abstract_of_a_class {
    public static void main(String[] args) {
        form_01 obj =new form_01();
        obj.run();
        obj.run_01();

    }
}
