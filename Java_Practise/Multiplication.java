import java.util.Scanner;
class Multiplication
  {
    public static void main(String args[])
    {
      int n,i=1,k;
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter the which table");
          n=sc.nextInt();
        System.out.println("Enter the number how much you");
       n=sc.nextInt();
      while(i<10)
        {
          System.out.println(n+"*"+i+"="+n*i);
          i++;
        }
    }
  }