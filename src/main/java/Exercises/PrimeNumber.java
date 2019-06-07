package Exercises;
import java.util.Scanner;

public class PrimeNumber
{
    Scanner Read = new Scanner(System.in);
    public String Prime()
    {
        System.out.println("Enter the input number");
        int InputNumber = Read.nextInt();
         if (InputNumber != 0) {
             for (int i = 1; i <= InputNumber; i++) {
                 int counter = 0;
                 for (int j = 1; j <= i; j++) {
                     if (i % j == 0) {
                         counter++;
                     }
                 }
                 if (counter == 2) {
                     System.out.println(i);
                 }
             }
         }
         else
             {
             return  "you entered an invalid input";
             }
        return "Exiting the program";
    }
}
