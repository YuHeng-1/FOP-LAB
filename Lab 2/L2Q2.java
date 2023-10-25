/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Scanner;
public class L2Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double P,D,R,M;
        int Y;
        System.out.println("Enter the price of the car (RM):");
        P=sc.nextDouble();
        
        System.out.println("Enter the down payment(RM):");
        D=sc.nextDouble();
        
        System.out.println("Enter the interest rate in %:");
        R=sc.nextDouble();
        
        System.out.println("Enter loan duration in year:");
        Y=sc.nextInt();
        
        M=(P-D)*(1+R*Y/100)/(Y*12);
        System.out.printf("The monthly payment : RM%.2f\n",M);
        
       
    }
}
