import java.util.*;
class Empoly1
  {
    private int eid;
    private String ename;
    private String edep;
    private  long sal;
    void setEid(int id)
    {
      this.eid=eid;
    }
    int getEid()
    {
      return this.eid;
    }
    void setEname(String ename)
    {
      this.ename=ename;
    }
  String getEname()
    {
      return this.ename;
    }
    void setEdep(String edep)
    {
      this.edep=edep;
    }
    String getEdep()
    {
      return this.edep;
    }
    void setsal(long sal)
    {
      this.sal=sal;
    }
    long getSal()
    {
      return this.sal;
    }
  }
class Empoly
  {
    public static void main(String args[])
    {
      Scanner  sc=new Scanner(System.in);
      Empoly1 em1=new Empoly1();
      Empoly1 em2=new Empoly1();
      //
      System.out.println("Enter eid");
      em1.setEid(sc.nextInt());
      System.out.println("Enter ename");
       em1.setEname(sc.next());
      System.out.println("Enter edep");
       em1.setEdep(sc.next());
         System.out.println("Enter sal");
       em1.setsal(sc.nextLong());
         //
         System.out.println("Enter eid");
      em2.setEid(sc.nextInt());
      System.out.println("Enter ename");
       em2.setEname(sc.next());
      System.out.println("Enter edep");
       em2.setEdep(sc.next());
         System.out.println("Enter sal");
       em2.setsal(sc.nextLong());
      System.out.println("The details are empoly1 are");
         System.out.println(em1.getEid()+" "+em1.getEname()+" "+em1.getEdep()+" "+em1.getSal());
      System.out.println("The details are empoly2 are");
         System.out.println(em2.getEid()+" "+em2.getEname()+" "+em2.getEdep()+" "+em2.getSal());
      }
  }
         