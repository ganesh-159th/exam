package add;
interface section
{
    void section_09();
    void section_67();
    default void section ()
    {
        System.out.println("\n the fundamental name of the school is :");
    }

}
interface  section01 extends section
{
    void fund();
    void rection();


}
class section78 implements  section,section01{

    @Override
    public void section_09() {
        System.out.println("\n the name of the school is :");
    }

    @Override
    public void section_67() {
        System.out.println( "\n the formation of the name of the school is :");

    }

    @Override
    public void fund() {
        System.out.println("\n the name of the form is givne below is :");
    }

    @Override
    public void rection() {
        System.out.println("\n the fundamental name of the school is given in the name of the form :");

    }
}

public class interface_program_01 {
    public static void main(String[] args) {
        section78 obj = new section78();
        obj.section_09();
        obj.section_67();

    }
}
