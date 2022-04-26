class Employ
  {
    String name;
    int id;
    String branch;
    int salary;
    public static void main(String args[])
    {
      Employ em1=new Employ();
      em1.name="tarun";
      em1.id=433;
      em1.branch="mech";
      em1.salary=18000;
            Employ em2=new Employ();
      em2.name="gowtham";
      em2.id=404;
        em2.branch="cse";
        em2.salary=20000;
       Employ em3=new Employ();
      em3.name="amuluya";
        em3.id=456;
          em3.branch="ece";
      em3.salary=25000;
             System.out.println(em1.name+" "+em1.id+" "+em1.branch+" "+em1.salary);
       System.out.println(em2.name+" "+em2.id+" "+em2.branch+" "+em2.salary);
      System.out.println(em3.name+" "+em3.id+" "+em3.branch+" "+em3.salary);
      
    }
  }