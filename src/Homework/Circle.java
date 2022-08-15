package Homework;

public class Circle {
    private static int radius;
    private static final double PI = 3.14;
    public Circle(int radius){
        Circle.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public double getPI() {
        return PI;
    }
    static double area(){
        return PI * radius * radius;
    }
    static double circumference(){
        return PI * 2 * radius;
    }
}
