import java.util.Scanner;
class Voting
  {
    public static void main(String arg[])
    {
      int age;
      System.out.println("Enter the age of person");
      Scanner sc=new Scanner(System.in);
      age=sc.nextInt();
      if(age>=18)
      {
        System.out.println("Eligible for vote");
      }
      else
      {
        System.out.println("Not Eligible for vote");
      }
    }
  }