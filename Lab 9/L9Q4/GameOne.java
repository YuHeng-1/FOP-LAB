
import java.util.Random;
public class GameOne extends Dice {
    private int firstScore, secondScore;
    public GameOne(String n) {
        super(n);
    }

    public void rollDice() {
        Random g = new Random();
        do {
            firstScore = g.nextInt(Integer.MAX_VALUE)%6 + 1;
            secondScore = g.nextInt(Integer.MAX_VALUE)%6 + 1;
            this.display();
            addScore(firstScore+secondScore);
            super.display();
            if (getScore()>=100) {
                displayWin();
                break;
            }
        } while(firstScore==secondScore);
    }

    public void display()  {
        System.out.println("Dice 1: " + firstScore + " Dice 2: " + secondScore + " Total: " + (firstScore+secondScore));
    }

}
