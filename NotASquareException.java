package com.company;

import java.util.Scanner;

public class Shape {
  
    int length,width;
  
    boolean isSquare() throws NotASquareException
    {
        if(length==width)
        {
            return true;
        }
        else
        {
            throw new NotASquareException();
        }
    }

    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter length : ");
        Shape S = new Shape();
        S.length=ip.nextInt();
        System.out.println("Enter width : ");
        S.width=ip.nextInt();
      
        try
        {
            if(S.isSquare())
            {
                System.out.println("Shape is square");
            }
        }
      
        catch(NotASquareException e)
        {
            System.out.println("NotASquareException has occurred");
        }
    }
}

class NotASquareException extends Exception
{
    NotASquareException()
    {
        System.out.println("Shape is not a Square");
    }
}
