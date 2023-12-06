/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Scanner;

public class L6Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 2; //prime number starts with 2
        int countIsPalin = 0;
        System.out.print("The first 20 palindromic prime: ");
        do {
            if (isPalindromePrime(i)) {
                System.out.print(i + " ");
                countIsPalin++;
            }
            i++;
        } while (countIsPalin < 20);
        System.out.println("");

        System.out.print("The first 20 emirp: ");
        for (int p = 1, q = 1; p <= 20; q++) {
            if (isEmirp(q)) {
                System.out.print(q + " ");
                p++;
            }
        }

        System.out.println("");
    }

    public static boolean isPrime(int a) {
        int count = 0;
        for (int p = 1; p <= a; p++) {
            if (a % p == 0) {
                count++;
            }
        }
        return count == 2; //determine whether the number is divisible by 1 and itself only.
    }

    public static int reverseDigit(int a) {
        int b = 0, c;
        while (a > 0) {
            b = b * 10 + a % 10;
            a /= 10;
        }
        return b;
    }

    public static boolean reverseSame(int a) {
        return a == reverseDigit(a);
    }

    //or reverse same --> is a palindrome
    public static boolean isPalindrome(int a) {
        int div = 1; // 1 --> 1 digit; 10 --> 2 digits; 100 --> 3 digits
        while (a / div >= 10) {
            div *= 10;
        }
        while (a != 0) {
            int left = a / div;
            int right = a % 10;
            if (left != right) {
                return false;
            }
            a = (a % div) / 10;
            div /= 100;
        }
        return true;
    }

    public static boolean isPalindromePrime(int a) {
        return isPrime(a) && reverseSame(a);
    }

    public static boolean isEmirp(int b) {
        int reverseInt = reverseDigit(b);
        return isPrime(reverseInt) && isPrime(b) && !isPalindromePrime(b);
    }
}
