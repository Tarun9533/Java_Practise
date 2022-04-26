import java.util.Scanner;
class Studentb
  {
    String name;
    int rollno;
    String branch;

    void readings()
    {
      System.out.println("readings");
    }
    void writing()
    {
      System.out.println("writing");
    }
  }

class Main
  {
    public static void main(String args[])
    {
      int i;
      Scanner sc=new Scanner(System.in);
      Student st1[]=new Student[10];
        for(i=0;i<4;i++)
          {
          st1[i]=new Student();
            System.out.println("Enter name");
             st1[i].name=sc.next();
            System.out.println("Enter the rollno");
           st1[i].rollno=sc.nextInt();
            System.out.println("Enter the branch");
           st1[i].branch=sc.next();
          }
    }
  }
  
