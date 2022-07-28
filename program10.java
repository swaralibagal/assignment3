/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

/**
 *
 * Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate. 
 */
import java.util.Scanner;
public class program10 {
     public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int sum = 0;
    char op;
    do{
      System.out.println("Enter two numbers");
      int num1= in.nextInt();
      int num2 = in.nextInt();
      sum = sum+num1+num2;
      System.out.println("Do you wish to perform another operation, Y/N");
      op =in.next().charAt(0);
    }while(op =='Y'||op=='y');
    System.out.println("sum "+sum);
  }
}
    

