
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
public class L5Q2 {
    public static void main(String[] args) {
        int [] num=new int[10];
        boolean [] repeat=new boolean [21]; //all 21 elements are false by default
        
        System.out.println("10 non-duplicate random integer within the range from 0 to 20:");
        for(int i=0;i<=9;i++){
            int random=(int)(Math.random()*21);
            // to check whether the random number generated is repeated or not
            if(!repeat[random]) //if(TRUE),then do....
                // all random number generated that is not repeated yet,"repeat[random]" will be assigned to TRUE
                repeat[random]=true;
            else{
                // to check whether the new random number generated is repeated or not.
                // if the new random number generated is repeated, it will generate a new one and keep doing this until the new generated number is not generated yet.
                while(repeat[random]){  
                    random=(int)(Math.random()*21);
                }
                repeat[random]=true;
            }
            num[i]=random;
            System.out.print(num[i]+" ");
        }
        System.out.println("");
        
        //or
        final int MAX = 20;
        int[] number = new int[10];
        int temp;
        boolean status;
        Random g = new Random();
        for(int i=0; i<number.length; i++) {
            status = true;
            temp = g.nextInt(MAX);
            for(int j=0; j<i; j++) // check if the generated number is repeated with the first until (i-1)th element
                if (temp==number[j]) {
                    status = false;
                    break; // break the for loop once the generated number is repeated
                }
            if (status)
                number[i] = temp;
            else
                i--;
        }
        System.out.println("10 non-duplicate random integer within the range from 0 to 20");
        for(int i=0; i<number.length; i++)
            System.out.print(number[i] + " ");
        System.out.println();
    }
}
