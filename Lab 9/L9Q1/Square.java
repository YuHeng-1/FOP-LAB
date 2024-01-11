/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Scanner;
public class Square extends Shape{
    private double length1;
    public Square() {
        super("Square");
    }
    public void getInput() {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter the side length of square: ");
        length1 = k.nextDouble();
        compute();
    }
    public void compute() {
        setPerimeter(length1*4);
        setArea(length1*length1);
    }
}
