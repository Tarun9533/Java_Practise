import java.util.Scanner;
class Countnegative
{
    public static void main(String args[])
    {
      int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array");
      int count=0;
      for(int i=0;i<5;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("Enter the elements");
      for(int i=0;i<5;i++)
        {
          if(a[i]<0) 
            count++; 
  }
      System.out.println(count);
      }
}