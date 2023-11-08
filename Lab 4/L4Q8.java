/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Random;
public class L4Q8 {
    public static void main(String[] args) {
        Random g=new Random();
        int n=g.nextInt(101);
        int count=0;
        System.out.print("The first "+n+" of prime number: ");
        
        for(int i=2;count<n;i++){
            int temp=0;
            for(int j=2;j<i;j++){ //range: 2 until (i-1)
                if(i%j == 0){
                    temp++; //Update the value of temp if i is divisible by any number in the range.
                    break; //break the second loop and continue to the first loop
                }
            }
            if(temp==0){ //temp=0 -> i is not divisible by any number in the range, it's a prime number.
                System.out.print(i+" ");
                count++;
            }
            
        }
        System.out.println("");
        
        //Method 2: 
        System.out.print("The first "+n+" of prime number: ");
        int count2=0;
         for(int i=2;count2<n;i++){
            int temp=0;
            for(int j=1;j<=i;j++){ //range: 1 until i
                if(i%j == 0){
                    temp++; //Update the value of temp if i is divisible by any number in the range.
                }
            }
            if(temp==2){ //temp=2 -> i is only divisble by 1 and itself, it's a prime number.
                System.out.print(i+" ");
                count2++;
            }
        }
        System.out.println("");
        }
    }
