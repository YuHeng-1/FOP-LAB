/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Random;

public class TesterL9Q4 {

    public static void main(String[] args) {
        GameOne a = new GameOne("Player1");
        GameOne b = new GameOne("Player2");
        boolean status;
        Random g = new Random();
        if (g.nextInt() % 2 == 0) {
            status = true;
        } else {
            status = false;
        }
        while (a.getScore() < 100 && b.getScore() < 100) {
            if (status) {
                a.rollDice();
                if (a.getScore() >= 100) {
                    break;
                }
                b.rollDice();
            } else {
                b.rollDice();
                if (b.getScore() >= 100) {
                    break;
                }
                a.rollDice();
            }
        }
        
        
//        GameTwo a = new GameTwo("Player1");
//        GameTwo b = new GameTwo("Player2");
//        boolean status;
//        Random g = new Random();
//        if (g.nextInt()%2==0)
//            status = true;
//        else
//            status = false;
//        while(a.getScore()<100 && b.getScore() <100) {
//            if (status) {
//                a.rollDice();
//                if (a.getScore()==100)
//                    break;
//                b.rollDice();
//            }
//            else {
//                b.rollDice();
//                if (b.getScore()==100)
//                    break;
//                a.rollDice();
//            }
//        }

    }
    
    
}
