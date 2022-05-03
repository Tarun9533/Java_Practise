import java.util.Scanner;
class ATM
  {

    int blns=50000;
    void withdraw(int amt)
      {
        if(blns>amt)
        {
          blns=blns-amt;
          System.out.println("Withdraw successfull");
        }
        else
        {
          System.out.println("Insufficient balance");
        }
      }
    void deposit(int amt)
      {
        blns=blns+amt;
        System.out.println("Deposit successfull");
       }
    void checkbalance()
    {
      System.out.println(blns);
      }
  }

class Atm
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      ATM atm=new ATM();
      atm.blns=10000;
      char ch='y';
      do{
        System.out.println("select an option from below");
        System.out.println(" 1.Withdraw \n 2.Deposit \n 3.checkbalance");
        int option=sc.nextInt();
        switch(option)
          {
            case 1:
             System.out.println("Enter the amount");
              int withdr=sc.nextInt();
              atm.withdraw(withdr);
              break;
            case 2:
             System.out.println("Enter the amount");
              int dpst=sc.nextInt();
              atm.deposit(dpst);
              break;
            case 3:
              atm.checkbalance();
              break;
            default:
              System.out.println("invalid option");
          }
        System.out.println("do you want to continue");
        ch=sc.next().charAt(0);
      }while(ch=='y');
    }
  }
