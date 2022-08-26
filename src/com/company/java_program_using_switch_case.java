package com.company;
import java.util.Scanner;
import java.util.*;
class calculation4 {
    static int add(int a, int b) {
        int g;
        g = a + b;
        System.out.println("\n the sum of the two number is :" + g);
        return g;

    }

    static int difference(int a, int b) {
        int g;
        g = a - b;
        System.out.println("\n the difference of the two number is :" + g);
        return g;
    }

    static double division5(double a, double b) {
        double g;
        g = a / b;
        System.out.println("\n the division of the two number is :" + g);
        return g;
    }

    static int multiplication6(int g, int y) {
        int u;
        u = g * y;
        System.out.println("\n the multiplication of the two number is :" + u);
        return u;

    }

    static int exist() {
        Scanner sc = new Scanner(System.in);
        int u = sc.nextInt();
        if (u == 1) {
            System.out.println("\n select the option \n 1:add\n 2: difference \n 3: division \n 4: multiplication \n5: exist ");

            Scanner sc1 = new Scanner(System.in);
            int g = sc1.nextInt();

            switch (g) {
                case 1:
                    calculation4.add(5, 6);
                    break;
                case 2:
                    calculation4.difference(7, 8);
                    break;
                case 3:
                    calculation4.division5(7, 8);
                    break;
                case 4:
                    calculation4.multiplication6(7, 8);
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + g);
            }

        } else {
            return 0;
        }
        return 0;
    }




}

public class java_program_using_switch_case {
    public static void main(String[] args) {

        int option = 1;

            {

                System.out.println("\n select the option \n 1:add\n 2: difference \n 3: division \n 4: multiplication \n5: exist ");

                Scanner sc = new Scanner(System.in);
                int g = sc.nextInt();

                switch (g) {
                    case 1:
                        calculation4.add(5, 6);
                        break;
                    case 2:
                        calculation4.difference(7, 8);
                        break;
                    case 3:
                        calculation4.division5(7, 8);
                        break;
                    case 4:
                        calculation4.multiplication6(7, 8);
                        break;
                    case 5:
                        calculation4.exist();

                    default:
                        throw new IllegalStateException("Unexpected value: " + g);
                }


            }

        }
    }

