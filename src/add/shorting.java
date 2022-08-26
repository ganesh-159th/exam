package add;



import java.util.Scanner;

public class shorting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("\n enter the size of the array :");
        int n= sc.nextInt();
        int a[]= new int[78];
        System.out.println("\n enter the elements in the array :");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();


        }
        System.out.println("\n youre enter number is :");
        for( int i=0;i<n;i++)
        {

            System.out.println(a[i]);
        }
        System.out.println("\n after short element is :");
        for(int i=0;i<(n-1);i++)
        {
            for(int j=0;j<(n+i-1);j++)
            {
                if(a[i]>a[i++])
                {
                    int tem=a[i];
                    a[i]=a[i++];
                    a[i++]=tem;
                    System.out.println(a[tem]);
                }

            }

        }


}}

