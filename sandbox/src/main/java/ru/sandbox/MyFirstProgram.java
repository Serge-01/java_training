package ru.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("World");
        hello("User");
        hello("Serge");

        Square s = new Square(5);
        System.out.println("Area with side " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4,6);
        System.out.println("Area with sides " + r.a + " and " + r.b + " = " + r.area());
    }

    public static void hello (String who) {
                System.out.println("Hello, " + who + "!");
    }

}