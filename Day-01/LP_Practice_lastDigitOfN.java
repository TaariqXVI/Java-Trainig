import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static void main (String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number: ");
         int num = sc.nextInt();
         
         int lastDigit = num % 10;
         
         System.out.println("The last Digit of the Number is " + lastDigit);
    }
