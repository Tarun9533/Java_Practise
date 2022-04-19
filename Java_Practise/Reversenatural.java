import java.util.Scanner;
class Reversenatural
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();
      int i=0;
      while(n>=i)
        {
          System.out.println(n);
          n--;
        }
        
    }
  }