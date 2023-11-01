/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Random;
public class L3Q2 {
    public static void main(String[] args) {
        Random r=new Random();
        int num=r.nextInt(6); //6 is exclusive
        
        switch(num){
            case 0:
                System.out.println(num+" is zero.");
                break;
            case 1:
                System.out.println(num+" is one.");
                break;
            case 2:
                System.out.println(num+" is two.");
                break;
            case 3:
                System.out.println(num+" is three.");
                break;
            case 4:
                System.out.println(num+" is four.");
                break;
            case 5:
                System.out.println(num+" is five.");
                break;
                
        }
    }
}
