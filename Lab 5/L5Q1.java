/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Scanner;
public class L5Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of students,N: ");
        int N=sc.nextInt();
        int []score=new int[N];
        int sum=0;
        int highest=0; // the lowest score is 0
        int lowest=100; // the highest score is 100
        System.out.print("The list of score: ");
        for(int i=0;i<score.length;i++){
            score[i]=(int)(Math.random()*101);
            System.out.print(score[i]+" ");
            sum=sum+score[i];
            if(score[i]>highest)
                highest=score[i];
            if(score[i]<lowest)
                lowest=score[i];
        }
        double average=(double)sum/N;
        System.out.println("\nThe highest score: "+highest);
        System.out.println("The lowest score: "+lowest);
        System.out.println("The average score: "+average);
    }
}
