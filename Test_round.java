/**
    * Test Round test the functionaly of round class
    * to store data an return data
    *  @author(s) Chien Lin, Lena Zheng, Qd Li
    *  @version 1.0
    *  @since 2017-10-01
    *
    */
    /**
    * Algorithm:
    * I) First turn of game randomly assigns computer or human to go first.
    * II)**** while humanTotalScore < 50 and computerTotalScore < 50 LOOP  ******
    *    a)output humanTotalScore and computerTotalScore
    *    b) set roundTotal and potentialTotal to 0.
    *    c)**** until die1 = 1 or die2 = 1 ***********
    *        i) roll a pair of die
    *          ii) if die1 <> 1 and die2 <> 1 then do next steps.
    *            1) sum result into roundTotal
    *            2) add roundTotal to potentialTotal
    *            3) print roundTotal and potentialTotal
    *            4) Determine if human or computer turn.
    *	               if human allow player to input Y to continue or N to stop.
    *                      i) if N then add potentialTotal to humanTotalScore
    *                          and set die1 = 1
    *                 if computer
    *                     i) if roundTotal >= 20 add roundTotal to computerTotalScore
    *                        and set die1 = 1
    *********  end c  ************************************************************
    ***  end II  *****************************************************************
    * III) output current player as winner and print out final score.
    *
*/

public class Test_round {
    public static void main(String[] args){
        int cur_round = 2;
        int humanCurrentTotalScore = 0;
        int computerCurrentTotalScore = 0;
        int currentPlayerScore;
        String player;

        // TESTING current classes.
        PairOfDie diePair = new PairOfDie();

        //should assign player based on round we are in. odd round is computer even round is human
        // Round  myRound = new Round(cur_round);
        //initialize round with who the player is, and their current total score
        //in the main function: if round is even, set the player to "Human", if round is odd, then set player to "Computer"
        if (cur_round%2 == 0) 
            {
              player ="Human";
              currentPlayerScore = humanCurrentTotalScore;
            }
        else 
            {
               player = "Computer";
               currentPlayerScore = computerCurrentTotalScore;
            }

        //start the round
        Round  myRound = new Round(player, currentPlayerScore);

        // myRound.setPotentialTotal(1000);

        System.out.println("Current Player: " + myRound.getPlayer());
        System.out.println("Current Score: " + myRound.getRoundScore());

        diePair.rollDice();
        System.out.println("\nFirst Dice: " + diePair.getDie1());
        System.out.println("Second Dice: " + diePair.getDie2());
        System.out.println("Sum of Dice: " + diePair.sumDice());

        //add round score adds accumulated score for that round
        myRound.addRoundScore(diePair.sumDice()); 

        System.out.println("Current Round Score: " + myRound.getRoundScore());
        System.out.println("Current Potential Total Score: " + myRound.getPotentialTotal());

        //if rolled a one, set the stop indicator to true
        if (diePair.rolledOne())
          {myRound.setStopInd(true);}

        //get the stop indicator
        System.out.println("Stop Indicator: " + myRound.getStopInd());

        //if there is the stop indicator is false, keep playing - this is just a repeat of the previous steps
        if (myRound.getStopInd() == false)
        {
            System.out.println("\nSecond roll");
            diePair.rollDice();
            System.out.println("\nFirst Dice: " + diePair.getDie1());
            System.out.println("Second Dice: " + diePair.getDie2());
            System.out.println("Sum of Dice: " + diePair.sumDice());
            myRound.addRoundScore(diePair.sumDice()); 

            System.out.println("Current Round Score: " + myRound.getRoundScore());
            System.out.println("Current Potential Total Score: " + myRound.getPotentialTotal());

        }

    }

}
