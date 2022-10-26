package org.example;

public class Triangle {
    public static void main(String [] args) {
        double a = 10.0;
        double b = 15.2;
        double alpha = 37.0;
        double radians = Math.toRadians(alpha);
        double area = (0.5 * a * b * Math.sin(radians));
        System.out.println("Площадь треугольника равна: " + area);
    }
}
