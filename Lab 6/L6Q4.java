/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
public class L6Q4 {

    public static void main(String[] args) {

        System.out.println("The greatest common divisor(GCD) of (24,8) is " + euclidean(24, 8));
        System.out.println("The greatest common divisor(GCD) of (200,625) is " + euclidean(200, 625));

    }
    public static int euclidean(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }
}
