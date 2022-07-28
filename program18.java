/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;
/*
Write a program to print following :

 
i)

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
ii)

             * 
           * * 
         * * * 
       * * * * 
     * * * * * 
   * * * * * *

iii)
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
* * * * * * 
 


*/
 


public class program18 {
      public static void main(String args[])  
      {
          first();
          second();
          third();
      }
    public static void first()   
{   
//i for rows and j for columns      
//row denotes the number of rows you want to print  
int i, j, row=6;   
//outer loop for rows  
for(i=0; i<row; i++)   
{   
//inner loop for columns  
for(j=0; j<=i; j++)   
{   
//prints stars   
System.out.print("* ");   
}   
//throws the cursor in a new line after printing each line  
System.out.println();   
}   
}   
    
public static void second()
{    
//i for rows and j for columns      
//row denotes the number of rows you want to print  
int i, j, row = 6;       
//Outer loop work for rows  
for (i=0; i<row; i++)   
{  
//inner loop work for space      
for (j=2*(row-i); j>=0; j--)         
{  
//prints space between two stars      
System.out.print(" ");   
}   
//inner loop for columns  
for (j=0; j<=i; j++ )   
{   
//prints star      
System.out.print("* ");   
}   
//throws the cursor in a new line after printing each line  
System.out.println();   
}   
}   

public static void third()  
{    
//i for rows and j for columns      
//row denotes the number of rows you want to print  
int i, j, row = 6;       
//Outer loop work for rows  
for (i=0; i<row; i++)   
{  
//inner loop work for space      
for (j=row-i; j>1; j--)   
{  
//prints space between two stars  
System.out.print(" ");   
}   
//inner loop for columns  
for (j=0; j<=i; j++ )   
{   
//prints star      
System.out.print("* ");   
}   
//throws the cursor in a new line after printing each line  
System.out.println();   
}   
}   
    
}
