import java.util.*;
class Animal
  {
    void animal_sound()
    {
      System.out.println("Sounds");
    }
  }
class Cat extends Animal
  {
    void animal_sound()
    {
      System.out.println("meow meow");
    }
  }
class Dog extends Cat
  {
    void animal_sound()
    {
      System.out.println("bow bow");
    }
  }
class Overriding
  {
    public static void main(String args[])
    {
      Cat c=new Cat();
      c.animal_sound();
      Dog d=new Dog();
      d.animal_sound();
    }
  }