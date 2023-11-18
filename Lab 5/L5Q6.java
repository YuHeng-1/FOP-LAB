/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */

import java.util.Scanner;
public class L5Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int num=sc.nextInt();
        System.out.println("");
        int [][]pascalTri=new int [num][num];
        
        for(int i=0;i<pascalTri.length;i++){
            pascalTri[i][0]=1;
        }
        for(int i=1;i<pascalTri.length;i++){
            for(int j=1;j<=i;j++){
                pascalTri[i][j]=pascalTri[i-1][j-1]+pascalTri[i-1][j];
            }
        }
        
        System.out.println("The Pascal Triangle with "+num+" row(s)");
        for(int i=0;i<pascalTri.length;i++){
            for(int j=0;j<pascalTri[i].length;j++){
                System.out.printf("%-5d",pascalTri[i][j]);
                // System.out.print(pascalTri[i][j]+" ");
            }
            System.out.println("");
            
        }
    }
}
