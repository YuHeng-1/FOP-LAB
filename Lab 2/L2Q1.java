/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Scanner;
public class L2Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double fahrenheit, celcius;
        System.out.print("Enter temperature in Fahrenheit: ");
        //without 'ln' - display text on the console without moving the cursor to a new line.
        fahrenheit=sc.nextDouble();
        celcius=(fahrenheit-32)/1.8;
        System.out.printf("The temperature in degree Celcius is : %.2f\n",celcius);
        /*
        'printf' - to display output with specific formatting
        common format specifiers:
        %s: String
        %d: Integer
        %f: floating-point number
        %c: Character
        %b: Boolean
        %n: newline character
        */
    }
}
