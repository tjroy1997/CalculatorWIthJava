import java.util.Scanner;

public class Calculator
{
    public static void main(String args[])
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a=scr.nextDouble();
        System.out.println("Enter second Number:");
        double b=scr.nextDouble();
        double addition=a+b;
        double subtraction=a-b;
        double multiplication=a*b;
        double division=a/b;
        System.out.println("Addition of the two number is "+addition);
        System.out.println("Subtraction of the two number is "+subtraction);
        System.out.println("Multiplication of the two number is "+multiplication);
        System.out.println("Division of the two number is "+division);
        System.out.println("Thanks for using the program");


    }
}
