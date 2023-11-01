/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
import java.util.Random;

public class L3Q4 {
    public static void main(String[] args) {
        Random g=new Random();
        int d1P1,d2P1,d1P2,d2P2;
        int scoreP1=0;
        int scoreP2=0;
        //generate dice value range from 1 to 6
        d1P1=(int)(Math.random()*6)+1; 
        d2P1=(int)(Math.random()*6)+1;
        d1P2=(int)(Math.random()*6)+1;
        d2P2=(int)(Math.random()*6)+1;
        System.out.println("First round: ");
        System.out.println("Player 1- "+d1P1);
        System.out.println("Player 2- "+d1P2);
        System.out.println("Second round: ");
        System.out.println("Player 1- "+d2P1);
        System.out.println("Player 2- "+d2P2);
        
        // add the total dice value of each player
        scoreP1=d1P1+d2P1;
        scoreP2=d1P2+d2P2;
       
        //display score of player1 and player2
        System.out.println("Score player 1: "+scoreP1);
        System.out.println("Score player 2: "+scoreP2);
        
        //determine the winner
        if(scoreP1>scoreP2)
            System.out.println("The winner is Player 1. Congratulations!");
        else if(scoreP2>scoreP1)
            System.out.println("The winner is Player 2. Congratulations!");
        else
            System.out.println("Tie");
        
        //or a simpler way is to directly sum up the value of two dices for each player
        int p1=g.nextInt(6)+1+g.nextInt(6)+1;
        int p2=g.nextInt(6)+1+g.nextInt(6)+1;
        
        System.out.println("Player 1 Score: "+ p1);
        System.out.println("Player 2 Score: "+ p2);
        if (p1 > p2)
            System.out.println("Player 1 WIN!");
        else if (p2 > p1)
            System.out.println("Player 2 WIN!");
        else
            System.out.println("The game is TIE!");

}
}