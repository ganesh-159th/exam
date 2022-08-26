package com.company;
interface hospital
{
    void charging();
    void discharging();
    void hospital_bill();


}
interface hospital_ambulance
{
    void emergency();
    void emergency_calls();

}
class cosmology
{
    void start()
    {
        System.out.println("\n the given function can be implement by the seek of the formation of the class in the given form of the school");
    }
}
class information_34 extends cosmology implements hospital,hospital_ambulance
{


    @Override
    public void charging() {
        System.out.println("\n the person how what to the charging of the patient of the person :");
        //charging();
        {
            System.out.println("\n the high level of the person in the given form of the school:");

        }
      //  charging();
        //charging();
      //  discharging();
    }

    @Override
    public void discharging() {
       // discharging();
        System.out.println("\n the discharging of the person in the given some of the format and solving the given condition");


    }

    @Override
    public void hospital_bill() {
//hospital_bill();

    }

    @Override
    public void emergency() {
     //   hospital_bill();
       // emergency();


    }

    @Override
    public void emergency_calls() {
      //  emergency_calls();
        System.out.println("\n the emergency _bill is on the rock :");

    }
}

public class java_interface_practise_programming {
    public static void main(String[] args) {
        cosmology obj=new information_34();
        cosmology obj1= new cosmology();
        information_34 obj2 =new information_34();
        obj.start();
        obj.equals(obj1);
        obj2.emergency_calls();
        obj2.emergency();
        obj2.hospital_bill();
        obj2.charging();

    }
}
