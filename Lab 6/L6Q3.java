/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class L6Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r= new Random();
        final int MAX=10001;
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = r.nextInt(MAX);
        }
        System.out.println("The array of integers before reversing: " + Arrays.toString(num));
        reverseDigit(num);
        System.out.println("The array of integers after reversing: " + Arrays.toString(num));
    }

    
    public static void reverseDigit(int[] a) {
        int b=0, c;
        for(int i=0; i<a.length; i++) {
            c = a[i];
            while (c>0) {
                b = b*10 + c%10;
                c = c/10;
            }    
            a[i] = b;
            b=0;
        }
    }
    
    // or
    public static void reverse(int a[]) {
        for (int i = 0; i < a.length; i++) {
            String num = Integer.toString(a[i]);
            String reverse = "";
            for (int j = num.length() - 1; j >= 0; j--) {
                reverse += num.charAt(j);
            }
            a[i] = Integer.parseInt(reverse);
        }
    }
}
