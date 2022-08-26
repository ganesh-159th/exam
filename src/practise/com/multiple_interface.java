package sample.com;
interface animal
{
    void dog();
}
interface  food{
    void banana();
}
class  all implements  animal,food{

    @Override
    public void dog() {
        System.out.println("\n the dog");
    }

    @Override
    public void banana() {
        System.out.println("\n the banana");

    }
}

public class multiple_interface {
    public static void main(String[] args) {
        all obj= new all();
        obj.banana();
        obj.dog();
    }
}
