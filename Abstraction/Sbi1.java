import java.util.Scanner;
abstract class Bank
{
    long accountnum;
    long pannum;
    abstract void rate_of_interest();
    void display()
    {
      System.out.println(accountnum+" "+pannum);
      }
  }
class sbi_bank extends Bank
  {
    void rate_of_intrest()
    {
       System.out.println("rate of interest");
  }
 class Sbi1
   {
      public static void main(String args[])
     {
       Scanner sc=new Scanner(System.in);
       sbi_bank sbank=new sbi_Bank();
       System.out.println("Enter account number");
       sbank.accountnum=sc.nextLong();
       System.out.println("Enter pan number");
       sbank.pannum=sc.nextLong();
       sbank.display();
         sbank.rate_of_interest();
     }
   }
  }
  