/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Scanner;
public class L3Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius;
        int x,y;
        
        System.out.print("Enter the radius of circle: ");
        radius=sc.nextInt();
        System.out.print("Enter a x-coordinate: ");
        x=sc.nextInt();
        System.out.print("Enter a y-coordinate: ");
        y=sc.nextInt();
        
        
        // equation of circle : (x-a)^2 + (y-b)^2 = radius^2
        // where(a,b) is the center of circle
        if((x*x + y*y)>(radius*radius)){
            System.out.println("("+x+","+y+") is outside the circle.");
        }
            else if ((x*x + y*y)<(radius*radius)){
                System.out.println("("+x+","+y+") is inside the circle.");
            }
        else
                System.out.println("("+x+","+y+") is on the circle.");
    }
}
