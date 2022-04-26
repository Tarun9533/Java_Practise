import java.util.Scanner;
class Divisible
{
    public static void main(String args[])
    {
      int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array");
      for(int i=0;i<5;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("Enter the elements");
      for(int i=0;i<5;i++)
        {
          if(a[i]%5==0) 
            System.out.println(a[i]);
  }
      }
}