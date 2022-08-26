package com.company;
interface home1
{
    interface child_room
    {
        interface grand_father_room
        {
            void father_room();
        }
        void sofa();
        void toy_store();
    }
    void kitchen();
    void bedroom();
    void hall();

}
class collection implements  home1, home1.child_room,home1.child_room.grand_father_room
{

    @Override
    public void sofa() {
        System.out.println("\n this is the child sofa and implement for the cost each sofa:");

    }

    @Override
    public void toy_store() {
        System.out.println("\n toy_store from the house and implement for the eek of the show:");

    }

    @Override
    public void kitchen() {
        System.out.println("\n the kitchen is for the show and it is on the head of the show :");

    }

    @Override
    public void bedroom() {
        System.out.println("\n bedroom and it is the class of the school and it is in the from of the show :");

    }

    @Override
    public void hall() {
        System.out.println("\n this is actually the home were we can find the show room for the use of the algorithm;");

    }


    @Override
    public void father_room() {
        System.out.println("\n this is my grand father room:");

    }
}
public class java_programming_nested_interfaces {
    public static void main(String[] args) {
        collection obj=new collection();
        obj.bedroom();
        obj.father_room();
        obj.hall();

    }

}
