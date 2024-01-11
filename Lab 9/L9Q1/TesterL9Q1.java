/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
public class TesterL9Q1 {
    public static void main(String[] args) {
           // Rectangle
           Rectangle rec = new Rectangle();
           rec.getInput(); // get the side length (2-length and width)
           rec.display();
           
           // Square
           Square sq = new Square();
           sq.getInput(); // get the side length (1 only)
           sq.display();
           
           // Circle
           Circle c = new Circle();
           c.getInput(); // get the diameter
           c.display();
           
    }
}
