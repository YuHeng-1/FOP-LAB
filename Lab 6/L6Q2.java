/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Scanner;
public class L6Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // print triangle
        System.out.print("Enter the height of triangle: ");
        int tri=sc.nextInt();
        for(int i=1;i<=tri;i++){
            multiPrint(tri-i,' ');
            multiPrint(2*i-1,'*'); //odd number
            multiPrint(tri-i,' ');
            System.out.println("");
        }
        
        // print diamond
        System.out.print("Enter the height of diamond(odd number): ");
        int diam=sc.nextInt();
        int upper= (int)(Math.round((double)diam/2));
        int lower=diam-upper;
        for(int i=1;i<=upper;i++){
            multiPrint(upper-i,' ');
            multiPrint(2*i-1,'*');
            multiPrint(upper-i,' ');
            System.out.println("");
            
        }
        for(int i=lower-1;i>=0;i--){ 
            multiPrint(lower-i,' '); 
            multiPrint(2*i+1,'*');
            multiPrint(lower-i,' '); 
            System.out.println("");
        }
    }
    public static void multiPrint(int n,char c){
        for(int i=0;i<n;i++){
            System.out.print(c);
        }
    }
}
