/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Scanner;
public class Rectangle extends Shape {
    private double length1, length2;
    public Rectangle() {
        super("Rectangle");
    }
    public void getInput() {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter the sides length of rectangle: ");
        length1 = k.nextDouble();
        length2 = k.nextDouble();
        compute();
    }
    public void compute() {
        setPerimeter(length1*2 + length2*2);
        setArea(length1*length2);
    }
}
