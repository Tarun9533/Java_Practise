class Student
  {
    String name;
    int rollno;
    String branch;
    public static void main(String args[])
    {
      Student st1=new Student();
      st1.name="tarun";
        st1.rollno=433;
          st1.branch="ece";
            Student st2=new Student();
      st2.name="gowtham";
        st2.rollno=404;
          st2.branch="cse";
            System.out.println(st1.name+" "+st1.rollno+" "+st1.branch);
      System.out.println(st2.name+" "+st2.rollno+" "+st2.branch);
      
    }
  }