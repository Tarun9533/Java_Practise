import java.util.Scanner;
class Even
  {
    public static void main(String args[])
    {
      int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array");
      for(int i=0;i<10;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("Enter the elements");
      for(int i=0;i<10;i++)
        {
          if(a[i]%2==0)
          System.out.println(a[i]);
        }
          
    }
    
  }