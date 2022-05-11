import java.util.Scanner;
/**
 * This is the computer pig player. Currently, it's pretty stupid: it makes
 * exactly one roll each turn and then quits. Your job for the homework is to
 * make it smarter.
 * @author Adam Smith
 * @version 1.0
 */
public class ComputerPigPlayer extends PigPlayer {
    /**
     * The main constructor for <code>ComputerPigPlayer</code>.
     * @param name The <code>ComputerPigPlayer</code>'s name
     */
    public ComputerPigPlayer(String name) {
        super(name);
    }
    /**
     * This function does nothing. It is here to fulfill the requirements
     of the abstract <code>PigPlayer</code> class.
     * @param myScore the player's current score (unused)
     * @param opponentsScore the opponent's current score (unused)
     */
    @Override
    public void beginTurn(int myScore, int opponentsScore) {
        System.out.println("it is now " + getName() + "'s turn!");
        System.out.println("Your score is "+opponentsScore+", and your opponent's is " +myScore+".");
    }
    /**
     * Should the player roll again? The computer always rolls once.
     * @param turnNumber which turn the player is on (unused)
     * @param rollNumber which roll the player is on
     * @param poolSize the number of points currently in the pool (unused)
     * @param myScore the number of points the player has already won
    (unused)
     * @param opponentsScore the number of points the opponent has already
    won
     * (unused)
     * @return true to roll again, false to stop
     */
    @Override
    public boolean decideIfShouldRoll(int turnNumber, int rollNumber, int
            poolSize, int myScore, int opponentsScore) {
        // Current strategy is to only roll once. Come up with a better strategy for the computer
        // player and implement it here.
        if ((int)(Math.random() * 101) > 20 || rollNumber == 1) return true;
        else return false;
    }
}