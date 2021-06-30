package com.company;

class CustomException extends Exception
{
    CustomException()
    {
        System.out.println("Custom Exception has occurred");
    }
}
public class NullPtException{
    static void method2()
    {
        throw new NullPointerException();
    }
    static void method1() throws CustomException
    {
        try
        {
            method2();
        }
        catch(NullPointerException e)
        {
            throw new CustomException();
        }
    }
    public static void main(String[] args)
    {
        try
        {
            method1();
        }
        catch(CustomException e)
        {
            System.out.println("NullPointerException has occurred");
        }
    }

}