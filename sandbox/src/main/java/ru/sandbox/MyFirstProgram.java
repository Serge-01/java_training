package ru.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("World");
        hello("User");
        hello("Serge");

        double len = 6;
        System.out.println("Area with side " + len + " = " + area(len));

        double a = 4;
        double b = 5;
        System.out.println("Area with sides " + a + " and " + b + " = " + area(a, b));
    }

    public static void hello (String who) {
                System.out.println("Hello, " + who + "!");
    }

    public static double area (double l) {
        return l * l;
    }

    public static double area (double a, double b){
        return a * b;
    }

}