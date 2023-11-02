/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Scanner;
public class L3Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c,d,e,f,x,y;
        String temp[];
        System.out.print("Enter a,b,c,d,e,f: ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        d=sc.nextDouble();
        e=sc.nextDouble();
        f=sc.nextDouble();
        
        if((a*d-b*c)==0){
            System.out.println("The equation has no solution");
        }
        else{
        x=(e*d-b*f)/(a*d-b*c);
        y=(a*f-e*c)/(a*d-b*c);
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
        
}
}
