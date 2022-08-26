package sample.com;
import java.util.*;
import java.util.Scanner; // imported the scanner class //

public class java_program_on_one_dimensional_array { //In main class
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int array[]=new int [89];
        System.out.println("\n enter the size of the array :");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("\n enter the number of element :");
            array[i]=sc.nextInt();

        }
        System.out.println("\n you're enter element are :");
        for(int i=0;i<n;i++)
        {
            System.out.println(array[i]);

        }
        System.out.println("\n after sorting element is :");
        for(int i=0;i<(n-1);i++)
        {

            if(array[i]>array[i++])
            {
             int temp=array[i];
             array[i]=array[i++];
             array[i++]=temp;
                System.out.println("\n the elements are :"+temp);
            }

        }


    }
}
