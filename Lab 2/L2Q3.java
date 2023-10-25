
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Hi
 */
public class L2Q3 {

    public static void main(String[] args) {
        int sum = 0;
        double average = 0.0;
        System.out.print("Random numbers in the range of 10 to 50 :");
        for (int i = 0; i < 3; i++) {
            /*(int) min+(Math.random() * ((max-min)+1))
               Math.random()*10 the range is : 0-9
             */
            int num = (int) (10 + Math.random() * ((50 - 10) + 1));
            System.out.print(num + " ");
            sum = sum + num;
        }
        average = sum / 3.0;
        System.out.println("\nSum: " + sum);
        System.out.printf("Average: %.2f\n", average);

        System.out.println("------------------------------");
        //or
        int num1, num2, num3;
        final int MAX = 41;
        Random r = new Random();
        num1 = 10 + r.nextInt(MAX);
        num2 = 10 + r.nextInt(MAX);
        num3 = 10 + r.nextInt(MAX);
        System.out.printf("Random numbers in the range of 10 to 50:%3d%3d%3d\n", num1, num2, num3);
        /* %3d -> specifying a numeric width of 3 for the placeholders. 
         Each integer value will be formatted within a field of width 3, even if it has fewer digits.
         */
        System.out.println("Sum: " + (num1 + num2 + num3));
        System.out.printf("Average: %.2f\n", (num1 + num2 + num3) / 3.0);

    }
}
