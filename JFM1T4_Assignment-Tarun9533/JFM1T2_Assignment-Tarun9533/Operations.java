/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
 import java.util.Scanner;

class Operations{

//main method
public static void main(String args []) {  
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number: ");
int a=sc.nextInt();
System.out.println("Enter second number:");
int b=sc.nextInt();

int  c= a-b;
int d = a*b;
int e = a/b;
int f = ++a;
int g = --a;
int h = a%b;

System.out.println("Difference of 2 numbers: "+c);
System.out.println("Product of 2 numbers: "+d);
System.out.println("Division of 2 numbers: "+e);
System.out.println("Increment and Decrement the number: "+f+" "+g);
System.out.println("Remainder of 2 numbers: "+h);

}
}
 