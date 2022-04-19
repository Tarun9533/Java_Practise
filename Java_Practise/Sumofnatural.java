import java.util.Scanner;
class Sumofnatural
  {
    public static void main(String args[])
    {
      int sum=0, n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();
      int i=1;
      while(i<=n)
        {
          sum=sum+i;
          i++;
        }
      System.out.println(sum);  
    }
  }