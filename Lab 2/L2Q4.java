/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Scanner;

public class L2Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, h, m, s;
        System.out.print("Enter the number of seconds: ");
        input = sc.nextInt();
        h = input / 3600;
        s = input % 3600;
        m = s / 60;
        s %= 60; // --> s=s%60
        System.out.println(input + " seconds is " + h + " hours, " + m + " minutes and " + s + " seconds");
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds\n", input, h, m, s);
        /* %d -> not specifying a numeric width for the placeholders.
         the method will use the default width, which is determined by the number of digits in the provided integer.
         */
    }
}
