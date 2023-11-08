/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Scanner;

public class L4Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score, min = 0, max = 0, cnt = 0, sum = 0, sumScoreSqu = 0;
        double average = 0, std = 0, variance;
        System.out.print("Enter a score [negative score to quit]: ");
        score = sc.nextInt();
        if (score < 0) 
            System.exit(0);
        
//        else{
//            cnt++;
//            sum+=score;
//            sumScoreSqu+=score*score;
//            max=score;
//            min=score;
//        }
        min = max = score;
        while (score >= 0) {
            cnt++;
            sum += score;
            sumScoreSqu += score * score;
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
            System.out.print("Enter a score [negative score to quit]: ");
            score = sc.nextInt();
        }
        if (cnt >= 1 && sum == 0) {
            System.exit(0);
        }
        average = (double) sum / cnt;
        variance = (sumScoreSqu - (sum * sum) / cnt) / (cnt - 1);
        std = Math.sqrt(variance);
        System.out.println("Variance: " + variance);
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        System.out.printf("Average Score: %.2f\n", average);
        System.out.printf("Standard Deviation: %.2f\n", std);
    }
}
