/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */

public class Shape {
    private String name;
    private double perimeter, area;

    public Shape(String n) { name = n; }
    public void setPerimeter(double a) { perimeter = a; }
    public double getPerimeter() { return perimeter; }
    public void setArea(double a) { area = a; }
    public double getArea() { return area; }
    public void display() {
        System.out.println("The Shape is " + name);
        System.out.printf("Perimeter is %.2f\n", perimeter);
        System.out.printf("Area is %.2f\n", area);
    }
}



