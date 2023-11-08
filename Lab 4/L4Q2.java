/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Scanner;

public class L4Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        System.out.print("Enter n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("(");
            for (int j = 1; j <= i; j++) {
                sum += j;
                System.out.print(j);
                if (j < i) {
                    System.out.print("+");
                }
            }
            System.out.print(")");
            if (i != n) {
                System.out.print("+");
            }
        }
        System.out.println("=" + sum);
    }
}
