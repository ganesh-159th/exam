package com.company;
import java.util.*;
import  java.util.Scanner;
// write the program that prints the array element from the given list of the  array //
public class java_array_practise_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n enter the size for   the array1 :");
        int n = sc.nextInt();
        System.out.println("\n enter the size for the array 2");
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];


        System.out.println("\n enter the elements in the given array size :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i] = sc.nextInt();
                b[j] = sc.nextInt();

            }
            System.out.println("\n the element you have enter is :");

            for (int i1 = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println(a[i]);
                    System.out.println(b[j]);
                }
            }
        }
    }
}
