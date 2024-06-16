//This program checks if an array is Sorted or Not in Java

import java.util.Scanner;
public class ArraySortedorNot {

    public static boolean isSorted(int a[], int n)
    {
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<a[i-1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of the Array = ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter array Values = ");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        sc.close();
        if(isSorted(a,n))
        {
            System.out.println("YES SORTED");
        }
        else
        {
            System.out.println("NOT SORTED");
        }
    }
}