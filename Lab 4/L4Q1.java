/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Scanner;

public class L4Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter an Integer: ");
        num = sc.nextInt();
        System.out.print("The factors are : ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (i == num) {
                    System.out.println(num);
                } else {
                    System.out.print(i + ", ");
                }
            }
        }
    }
}
