
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author JY
 */
public class L3Q1V2 {

    public static void main(String[] args) {
        int num1, num2, answer;
        char operand;
        boolean validOperand = true;
        Scanner k = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        num1 = k.nextInt();
        num2 = k.nextInt();
        k.nextLine(); // to consume the newline character(\n) left by nextInt()
        // nextLine() method reads entire line of input(including any spaces and tabs) until it encounters a newline character(\n)
        System.out.print("Enter the operand (+, -, *, /, %): ");
        operand = k.nextLine().charAt(0);
        /*
        or
        operand = k.next().charAt(0);
        - Can remove "k.nextLine()" that used to consume (\n)
        - next() method reads the next token (sequence of characters separated by whitespace) from the input.
        - It does not include the whitespace (spaces, tabs, or newlines) in the returned string, 
        so it stops reading when it encounters any whitespace character.
        */
        if (operand == '+') {
            answer = num1 + num2;
        } else if (operand == '-') {
            answer = num1 - num2;
        } else if (operand == '*') {
            answer = num1 * num2;
        } else if (operand == '/') {
            answer = num1 / num2;
        } else if (operand == '%') {
            answer = num1 % num2;
        } else {
            answer = 0;
            validOperand = false;
            System.out.println("Please enter a valid operand.");
        }
        // only print the result if the operand is a valid operand
        if (validOperand) {
            System.out.println(num1 + " " + operand + " " + num2 + " = " + answer);
        }

    }
}
