import java.util.Scanner;
class Firstlast
  {
    public static void main(String args[])
    {
      int n,count=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();
      int lastdigit=n%10;
      while(n!=0);
      {
        int rem=n%10;
        n=n/10;
      }
      int firstdigit=n;
      System.out.println(firstdigit+" "+lastdigit);
    }
  }