class NullPointerException
  {
    public static void main(String args[])
    {
      String str=null;
    int c;
    try{
      c=str.length();
      System.out.println(c);
    }
      catch(Exception e)
      {
        System.out.println(e);
      }
      System.out.println("Exception handeled");
    }
  }