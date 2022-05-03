import java.util.Scanner;
class Airthematicexception
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter frist number:");
      int a=sc.nextInt();
      System.out.println("enter second number:");
      int b=sc.nextInt();
      try {
         System.out.println(a/b);
      }
      catch(Exception e)
        {
          System.out.println(e);
        }
      System.out.println("Exception handelled");
    }
  }
