/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Scanner;
public class L4Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N,P,n;
        double M,i,C,L,R;
        double totalInterest=0;
        System.out.println("Enter principal amount: ");
        P=sc.nextInt();
        System.out.println("Enter interest in %: ");
        i=sc.nextInt();
        System.out.println("Enter total number of month(s): ");
        N=sc.nextInt();
        
        M=(P * (i/1200))/(1-Math.pow((1+i/1200),-N));
        System.out.printf("%-15s%-20s%-15s%-15s%-20s%-20s\n","Month","Monthly Payment","Principal","Interest","Unpaid Balance","Total Interest");
        for(int count=1; count<=N ;count++){
            n=count;
            C=M * Math.pow((1+ i/1200),-(1+N-n));
            L=M-C;
            R=L/(i/1200)-C;
            totalInterest=totalInterest+L;
            System.out.printf("%-15s%-20.2f%-15.2f%-15.2f%-20.2f%-20.2f\n",count,M,C,L,R,totalInterest);
        }
    }
}
