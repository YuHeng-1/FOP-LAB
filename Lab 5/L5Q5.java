/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Arrays;
import java.util.Scanner;

public class L5Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[20];
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 101);

        }
        System.out.println("A list of 20 random integer within 0 to 100 ");
        System.out.println(Arrays.toString(number).replace("[", "").replace("]", ""));

        for (int pass = 1; pass < number.length; pass++) {
            for (int i = 0; i < number.length - 1; i++) {
                if (number[i] < number[i + 1]) {
                    int hold = number[i];
                    number[i] = number[i + 1];
                    number[i + 1] = hold;
                }
            }
        }
        System.out.println("Array in descending order");
        System.out.println(Arrays.toString(number).replace("[", "").replace("]", ""));
        System.out.print("Enter a number to search: ");
        int key = sc.nextInt();
        System.out.println("");

        boolean status = false;
        //linear search
        int countL = 0;
        for (int i = 0; i < number.length; i++) {
            countL++;
            if (key == number[i]) {
                status = true;
                break;
            }
        }
        if (status) {
            System.out.println(key + " is found.");
            System.out.println("Linear search- " + countL + " loop(s).");
        } else {
            System.out.println("Linear search- " + key + " is not found.");
        }

        //binary search
        status = false;
        int countB = 0;
        int high = number.length - 1;
        int low = 0;
        while (low <= high) {
            int middle = (high + low) / 2;
            countB++;
            if (key == number[middle]) {
                status = true;
                break;
            } else if (key > number[middle]) {
                high = middle - 1;
            } else { //key<number[middle]
                low = middle + 1;
            }
        }
        if (status) {
            System.out.println(key + " is found");
            System.out.println("Binary search- " + countB + " loop(s)");
        } else {
            System.out.println("Binary search- " + key + " is not found.");
        }
    }
}
