package ru.stqa.pft.sandbox;

public class MyFirstProgram {



  public static void main(String[] args) {

   hello("world 1");
    hello("user");
    hello("Oleg");

    double l = 5;
    System.out.println("Sqare area with site " + l + " = " + area(l));

    double a = 4;
    double b = 6;
    System.out.println("Area of triangle with site " + a + " and " + b + " = " + area(a, b));

  }

  public static void hello(String somebody) {
    System.out.print("Hello, " + somebody + " ! ");
  }

  public static double area(double len) {
    return len * len;
  }

  public static double area(double a, double b) {
    return a * b;
  }
}
