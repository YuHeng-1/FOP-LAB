/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Random;

public class L4Q5 {

    public static void main(String[] args) {
        int player1 = 0, player2 = 0, dice;
        Random g = new Random();
        game:
        {
            for (int i = 0;; i++) {
                if (i % 2 == 0) { //to check whether it's Player 1's or Player 2's turn
                    do {
                        dice = g.nextInt(Integer.MAX_VALUE) % 6 + 1;
                        player1 += dice;
                        System.out.println("Player 1 - Roll Dice: " + dice + " Total: " + player1);
                        if (player1 > 100) {
                            System.out.println("Player 1 WIN!");
                            break game;
                        }
                    } while (dice == 6);
                } 
                else {
                    do {
                        dice = g.nextInt(6) + 1;
                        player2 += dice;
                        System.out.println("Player 2 - Roll Dice: " + dice + " Total: " + player2);
                        if (player2 > 100) {
                            System.out.println("Player 2 WIN!");
                            break game;
                        }
                    } while (dice == 6);
                }
            }
        }
    }
}
