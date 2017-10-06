# Assignment4_Hog_game
Game of Dice created in Java
TASKS
  1. Create PairofDice class - CL - Due 10/9/2017 Done
  2. Create Round class    - LZ Due 10/11/2017    Done
  3. Create Hog driver - QD, CL Due 10/13/2017
    a. initializes PairofDice object,
       humanTotalScore, ComputerTotalScore, roundNumber
       prints initial score
    b. outer while loop check if results of round ends the game.
        exit if (comp >= 50 or human >= 50)
        creates a round object
    c. inner while loop checks if stop round indicator = 'Y'
       exit if (either die = 1 or human selects no or computer round score >= 20)
    d. inside code implements round object
       rolls dice uses if statement to see if round indicator should be set to 'N'
       prints running score
    e. once outer while loop is exited. print final score and declare winner
   4. Testing zip completed program Due 10/15/2017
   5. Submit Due 10/17/2017

Class required: Die, PairOfDice and Hog.
Task 1. PairofDice class needs to be created. (??)
UML:
     PairOfDice
     - die1: Die
     - die2: Die
     + PairOfDice(): PairOfDice
     + getDie1(): Die
     + getDie2(): Die
     + setDie1(int): void
     + setDie2(int): void
     +sumDice(): int
     +rollDice():int
     +toString():String

Task 2. Program Hog
Using the PairOfDice class, design and implement a program to play a game called Hog. In this game, a computer user (player 1) competes again a human user (player 2).  On each turn, the current player rolls a pair of dice and accumulates points.  The goal is to reach 50 points before your opponent does.
If, on any turn, the player rolls a 1 on either die, all points accumulated for that round (turn) are forfeited and control of the dice moves to the other player.  The human player may voluntarily turn over the dice after each roll.  Therefore, the human player must decide to either roll again and risk losing points, or relinquish control of the dice, possibly allowing the other player to win.
Implement the computer player such that it always relinquishes the dice after accumulating 20 or more points in any given round/turn.

Data
char answer
PairOfDice dice
Die die1
Die die2
int computerTotalScore
humanTotalScore
computerRoundTotal //points for one turn
humanRoundTotal  //points for one turn
a.	Human player – retain turn score and input option to continue(??)
b.	Computer player – retain turn score and check to continue (??)
c.	Outer loop to check score in game pass control to next player or end game with result (??)
