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
        System.out.println("What you want to do with the numbers ?");
        System.out.println("Press + for Addition");
        System.out.println("Press - for Subtraction");
        System.out.println("Press * for Multiplication");
        System.out.println("Press / for Division");
        
        char decision;
        decision=scr.next().charAt(0);
        switch(decision)
        {
            case '+':
            System.out.println("Addition of the two number is ="+(a+b));
            break;
            case '-':
            System.out.println("Subtraction of the two number is ="+(a-b));
            break;
            case '*':
            System.out.println("Multiplication of the two number is ="+(a*b));
            break;
            case '/':
            System.out.println("Division of the two number is ="+(a/b));
            break;
            default:
            System.out.println("You may have press wrong button");
        }
    


    }
}
