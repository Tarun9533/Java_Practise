import java.util.Scanner;
class Min
{
    public static void main(String args[])
    {
      int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array");
      int min=0;
      for(int i=0;i<5;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("Enter the elements");
      for(int i=0;i<5;i++)
        {
          if(a[i]<min) 
          min=a[i];
            System.out.println(min);
  }
      }
}