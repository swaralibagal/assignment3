/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

/**
 *
 * 
Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
 */
import java.util.*;
public class program7 {
    
    public static void main(String []args)
    {
        Scanner keyboard= new Scanner(System.in);

        int counter;
        int i= 0;
        int num=0;
        int sumOdd= 0;
        int sumEven= 0;

        System.out.println("Enter integers other then Zero: ");
        num=keyboard.nextInt();

        System.out.println("The numbers you entered are: ");

        for (i =num; i !=0; i=i)
                {
                    if (i % 2 == 0)
                        sumEven = sumEven + i;
                    else
                        sumOdd = sumOdd + i;
                    i = keyboard.nextInt();
                }
        System.out.println("Even sum: " + sumEven);
        System.out.println("Odd sum: " + sumOdd);
    }
}

    
