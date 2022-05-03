import java.util.Scanner;
class ArrayindexoutofboundException
  {
    public static void main(String args[])
    {
      int i;
      int a[]=new int[5];
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the elements in array");
      for(i=0;i<5;i++)
          {
            a[i]=sc.nextInt();
          }
     try{
       System.out.println(a[5]);
       }
      catch(Exception e)
       {
         System.out.println(e);
       }
      System.out.println("Exception handeleed");
    }
  }