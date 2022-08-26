package com.company;
 abstract class  count
{
     abstract void game();
     abstract  void game_24();


}
class suck extends count
{
     void game()
    {
        System.out.println("\n hey this is game from the abstract class count :");


    }
    void game_24()
    {
        System.out.println("\n hey this is game_24 from the abstract class count :");
    }
}

public class program_on_abstract_classes {
    public static void main(String[] args) {
   suck obj=new suck();
   obj.game();
   obj.game_24();

    }
}
