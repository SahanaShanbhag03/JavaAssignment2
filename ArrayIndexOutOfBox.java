package com.company;
import java.util.Scanner;
public class ArrayIndexOutOfBound {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size=scanner.nextInt();

        int array[]= new int[size];

        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        try
        {
            System.out.println("Elements are :");
            for(int i=0;i<size+1;i++)
            {
                System.out.println(array[i]+" ");
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The last index of the array is "+size);
            System.out.println("ArrayIndexOutOfBoundsException has occurred");
        }
        finally
        {
            System.out.println("Program successful.");
        }
    }

}