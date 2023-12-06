/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Scanner;
public class L6Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ran1,ran2,input;
        int score=0;
        do{
            ran1=(int) (Math.random() * 13);
            ran2=(int)(Math.random()*13);
            System.out.println("Enter negative number to quit.");
            System.out.print(ran1+" x "+ran2+" = ");
            input=sc.nextInt();
            if(compare(ran1,ran2,input))
                score++;
           
        }while(input>=0);
        System.out.println("Your Score is "+score);
    }
    public static boolean compare(int a,int b,int c){
        return a*b==c;  // if (a*b=c), return true; if(a*b !=c), return false
    }
}
