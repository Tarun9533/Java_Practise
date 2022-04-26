/*  JFM1T2_Assignment7:

     Assume that the integer variable a is 20 and b is 10. Evaluate the following expressions and print the value of resultant variable:
     1. int b= a-- - --a;
     2. int c=a--;
     3. int d=a>>2;
     4. int e=a&b;
     Prompt the user input from the terminal.
     
     Sample Input:
     Enter a value: 
     20
     Enter b value: 
     10
     
     Expected Output:
     a-- - --a is: 2
     a-- is: 18
     a>>2 is: 4
     a&b is: 0
*/

//import statements for java program to read inputs using Scanner class

import java.util.Scanner;

class Expression{

//main method
public static void main(String args[])
  {
    int a=11;
    int b=10;
    int y= a-- - --a;
    int c =a--;
    int d= a>>2;
    int e= a&b;
    System.out.println("enter c value");
    System.out.println("enter d value");
    System.out.println("enter e value");
    System.out.println("enter y value");      
  }
/*Use the scanner class to provide input at execution time using scanner object.
  Scanner sc=new Scanner(System.in);
*/Scanner sc=new Scanner(System.in);

/*Take input from user
  System.out.println("Enter a value: ");
  int a=sc.nextInt();
*/int y=sc.nextInt();
  int c=sc.nextInt();
  int d=sc.nextInt();
  int e=sc.nextInt();

//print appropriate result for Expression operators
}
