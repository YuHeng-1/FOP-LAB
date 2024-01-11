/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hi
 */
public class Dice {
    private String name;
    private int score;

    public Dice(String n) {
        name = n;
        score = 0;
    }

    public void addScore(int n) {
        score += n;
    }

    public int getScore() { return score; }

    public void display() {
        System.out.println(name + " score " + score + " points");
    }

    public void displayWin() {
        System.out.println(name + " wins the game.");
    }
}
