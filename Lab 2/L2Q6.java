/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Scanner;
public class L2Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double M,ini,fin,Q;
        System.out.print("Enter the amount of water in gram: ");
        M=sc.nextDouble();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        ini=sc.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        fin=sc.nextDouble();
        
        double iniCelcius=(ini-32)/1.8;
        double finCelcius=(fin-32)/1.8;
        
        Q=(M/1000) * (finCelcius-iniCelcius)*4148;
        System.out.printf("The energy needed is %e\n",Q);
    
    }
}