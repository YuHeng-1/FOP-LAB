/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Scanner;

public class L3Q3 {

    public static void main(String[] args) {
        double sales, commission=0;
        Scanner k = new Scanner(System.in);
        System.out.print("Enter the sales volume: ");
        sales = k.nextDouble();
        if (sales > 1000)
            commission = (sales - 1000)*12.5/100 + 500*10/100 + 400*7.5/100 + 100*5/100;
        else if (sales > 500)
            commission = (sales - 500)*10/100 + 400*7.5/100 + 100*5/100;
        else if (sales > 100)
            commission = (sales - 100)*7.5/100 + 100*5/100;
        else if (sales > 0)
            commission = sales*5/100;
        else
          System.out.println("Invalid sales volume.");

        System.out.println("Total commission is " + commission + " for " + sales + " sales volume.");
    }
}
