import java.util.Scanner;
class trim
  {
   public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
       System.out.println("Enter Length string:");
    String str=sc.nextLine();
    if(str.contains(@)&&str.contains(.))
    {
      System.out.println("Found");
    }
    else
    {
      System.out.println("Not Found"); 
    }
    }
  }