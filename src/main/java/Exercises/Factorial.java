package Exercises;
import java.util.Scanner;

public class Factorial {

    public int FactorialFunction()    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int InputNumber = in.nextInt();
        for ( int i = InputNumber-1;i>=1;i--)
        {
            InputNumber = InputNumber * i;
        }
        System.out.print("The Factorial of the given number is: ");
        return  InputNumber;
    }
}
