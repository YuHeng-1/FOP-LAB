/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Scanner;
import java.util.Random;

public class L5Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter the number of employee,N: ");
        int N = sc.nextInt();
        int[][] workHours = new int[N][7];
        int[] total = new int[N];
        for (int i = 0; i < N; i++) { // employee
            for (int j = 0; j < 7; j++) { // 7 days
                workHours[i][j] = r.nextInt(8) + 1;
                total[i] = total[i] + workHours[i][j];
            }

        }

        System.out.println("The working hours and total hours of the employees: ");
        System.out.printf("%-10s%5s%5s%5s%5s%5s%5s%5s\n", "", "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa");
        for (int i = 0; i < N; i++) {
            System.out.printf("%-10s", "Employee " + (i + 1));
            for (int j = 0; j < 7; j++) {
                System.out.printf("%5d", workHours[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Total Work Hours:");
        for (int i = 0; i < N; i++) {
            System.out.println("Employee " + (i + 1) + " : " + total[i]);
        }

    }
}
