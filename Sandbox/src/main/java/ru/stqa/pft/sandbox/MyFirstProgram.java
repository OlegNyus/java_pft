package ru.stqa.pft.sandbox;

public class MyFirstProgram {


  public static void main(String[] args) {

    hello("world 1");
    hello("user");
    hello("Alex");

    Square s = new Square(5);
    System.out.println("Area of square with side " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,6);
    System.out.println("Area of triangle with side " + r.a + " and " + r.b + " = " + r.area());

    PointEx d = new PointEx(3, 5);
    System.out.println("Distance between two PointsEX " + d.p1 + " And " + d.p2 + " = " + Distance(d));
  }

  public static void hello(String somebody) {
    System.out.print("Hello, " + somebody + " ! ");
  }

    public static double Distance(PointEx d ){
      return d.p1 * d.p2;
    }



}
