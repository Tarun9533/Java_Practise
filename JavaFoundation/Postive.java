import java.util.Scanner;
class Postive
  {
    public static void main(String arg[])
    {
      int n;
      System.out.println("Enter the value of n");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      if(n>=0)
      {
        System.out.println("The number is postive");
      }
      else
      {
        System.out.println("The number is negative");
      }
    }
  }