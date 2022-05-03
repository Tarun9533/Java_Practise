import java.util.Scanner;
abstract class shape
  {
    String a;
    abstract void draw();
    void display()
    {
      System.out.println("drawing");
    }
  }
class Rectangle extends shape
  {
    void draw()
    {
       System.out.println("This is a Rectangle");
    }
  }
class Square extends shape
  {
    void draw()
    {
       System.out.println("This is a Square");
    }
  }
class Circle extends shape
  {
    void draw()
    {
       System.out.println("This is a Circle");
    }
  }
class Shapes
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Rectangle r=new Rectangle();
      System.out.println("The shape is Rectangle");
      r.a=sc.next();
      r.display();
      r.draw();
      Square s=new Square();
      System.out.println("The shape is Square");
      s.a=sc.next();
      s.display();
      s.draw();
      Circle c=new Circle();
      System.out.println("The shape is Circle");
      c.a=sc.next();
      c.display();
      c.draw();
    }
  }
