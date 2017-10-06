//********************************************************************
//  Round.java       
//
//  Represents the round of rolling the pair of dies
//********************************************************************

public class Round
{
    // int totalScore;
    String currentPlayer;
    int totalScore, roundScore = 0;
    boolean stopInd = false;




    //-----------------------------------------------------------------
    //  Constructor: for each round of the game
    //-----------------------------------------------------------------
    public Round(String player, int inTotalScore)
        {
            currentPlayer = player;
            totalScore = inTotalScore;
        }

    public String getPlayer()
        {return currentPlayer;}

    public void addRoundScore(int sumDice)
        {roundScore += sumDice;}

    public int getRoundScore()
        {return roundScore;}

    public int getPotentialTotal()
        {return roundScore + totalScore;}

    public boolean getStopInd()
        {return stopInd;}

    public void setStopInd(boolean indicator)
        {stopInd = indicator;}

}
