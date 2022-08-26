package com.company;
class invalid_exception extends Exception {
    @Override
    public String getMessage() {
        return "\n you have enter the invalid exception ";
    }
}
class dividedbyzero extends Exception{
    @Override
    public String getMessage() {
        return "\n the number is can't divided by zero ";
    }
}
class multiplicationmax extends  Exception{
    @Override
    public String getMessage() {
        return super.getMessage()+"\n the max of of a==9000 then it can't be multiplied :";
    }
}
class difference1 extends Exception{
    @Override
    public String getMessage() {
        return super.getMessage()+"\n the minus operation  cant be performed :";
    }
}

class customclass
{
    double sum (double a, double b)throws invalid_exception {
        if(a==8||b==9)
        {
            throw new invalid_exception();
        }
        {
            return (a + b);
        }
    }
    double difference (double a,double b)throws difference1 {
        if(a==0&& b==11)
        {
            throw new difference1();
        }
        else

        {
            return (a - b);
        }
    }
    double multiplication (double a,double b) throws multiplicationmax {
        if(a==9000)
        {
            throw new multiplicationmax();
        }
        else
        {
            double r;
            r=a+b;
            System.out.println("\n the multiplication of the two nubmer is :"+r);

        }
        return a;
    }
    double division(double a,double b)throws dividedbyzero {
        if(b==0)
        {
            throw new dividedbyzero();
        }
        else
        {
            return (a / b);
        }
    }

}

public class java_programming_calender_class {
    public static void main(String[] args) throws invalid_exception,dividedbyzero ,multiplicationmax,difference1{

        customclass o=new customclass();
        o.multiplication(90,89);

    }
}
