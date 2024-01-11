/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Scanner;
public class Circle extends Shape{
    private double diameter;
    public Circle() {
        super("Circle");
    }
    public void getInput() {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter the diameter of circle: ");
        diameter = k.nextDouble();
        compute();
    }
    public void compute() {
        setPerimeter(diameter*Math.PI);
        setArea(diameter*diameter*Math.PI/4);
    }
}
