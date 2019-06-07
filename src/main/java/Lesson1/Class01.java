package Lesson1;

import java.util.Scanner;

public class Class01 {
    public  static  void main(String[] args)
    {
        // Reading from Console
         Scanner SC = new Scanner(System.in);
         int InputNumber = SC.nextInt();
        //System.out.println("Hello World");
         String text1 = "This is a simple sentence with numbers and characters 1,2,3,4";

        //Concatenate two strings
         String concatenate = text1.concat(". additional text");
        // System.out.println(concatenate);

        //index of the given value in the paranthesis
         int stringIndexOf = text1.indexOf("simple");
         String Substring = text1.substring(stringIndexOf, stringIndexOf+6);
         System.out.println(stringIndexOf);

        //contains keyword reads the whole string from index 0 to last index and compares that whole
        //index value with the string being compared and returns true the index matches
         String string1 = " H H ello I am Krishna";
         String string2 = "Hello I am Krishna";
         System.out.println(string1.contains(string2));
         //equals keyword will return true if both the strings are identical in every way
         String string3 = "Hello I am Krishna";
         String string4 = "Hello I am Krishna";
         System.out.println(string3.equals(string4));

       // String subString = text1.substring(stringIndexOf ,stringIndexOf +5);
       // System.out.println(subString);
    }
}
