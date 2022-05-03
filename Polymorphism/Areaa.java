import java.util.*;
class Area
  {
    int area(int l,int b)
    {
      return(l*b);
    }
    int area(int s)
    {
      return(s*s);
      }
    double area(double r)
    {
      return(3.14*r*r);
    }
  }
class Areaa
  {
    public static void main(String args[])
    {
      Area ar=new Area();
      int x=ar.area(1,2);
      int y=ar.area(2);
      int z=ar.area(4);
      System.out.println(x+" "+y+" "+z);
    }
  }

class This
  {
    int rollno;
    String name;
    String branch;
    This(int rollno,String name)
    {
      this.rollno=rollno;
      this.name=name;
    }
    This(int rollno,String name,String branch)
    {
      this(rollno,name);
      this.branch=branch;
    }
  }   