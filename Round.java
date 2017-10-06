//********************************************************************
//  Round.java       
//
//  Represents the round of rolling the pair of dies
//********************************************************************

public class Round
{
    // int totalScore;
    String currentPlayer;
    int roundScore = 0;
    boolean stopInd = false;



    //-----------------------------------------------------------------
    //  Constructor: for each round of the game
    //-----------------------------------------------------------------
    public Round(String player)
    {
        currentPlayer = player;
    }

    //-----------------------------------------------------------------
    //  Rolls the die and returns the result.
    //-----------------------------------------------------------------
    // public void roll()
    // {
    //     onePair.rollDice();
    //     System.out.println(onePair.toString());
    // }

    public String getPlayer()
        {return currentPlayer;}

    public void addRoundScore(int sumDice)
        {roundScore += sumDice;}

    public int getRoundScore()
        {return roundScore;}

    public int getPotentialTotal(int currentTotal)
        {return roundScore + currentTotal;}

    public boolean getStopInd()
        {return stopInd;}

    public void setStopInd(boolean indicator)
        {stopInd = indicator;}

}
