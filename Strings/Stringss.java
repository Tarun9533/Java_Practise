class Stringss
  {
    public static void main(String args[])
    {
      String str1="Bitlabs";
      String str2="Bitlabs";
      String str3=new String("Bitlabs");
      String str4=new String("Bitlabs");
      if(str1==str2)
      {
        System.out.println("True");
      }
      else
        {
          System.out.println("False");
        }
      if(str1.equals(str2))
      {
        System.out.println("True");
      }
      else
        {
          System.out.println("False");
        }
    }
  }