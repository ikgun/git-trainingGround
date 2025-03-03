package chapter4;

/*
The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.

Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number
of spaces on the game board. Here’s the code to do this ((import is java.util.Random):

After each roll, tell the user which game space they are on and how many more spaces they have to go to win.

Repeat this 4 additional times, for 5 rolls in total.

However, if the user gets to 20 before 5 rolls, end the game - they’ve won.

If they are greater than or less than 20 spaces exactly, they lose.

Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.
 */

import java.util.Random;

public class RollTheDiceGame {

    public static void main(String[] args) {

        int currentGameSpace = 0;
        int totalBoardSpace = 20;
        int totalDiceRolls = 0;
        int maxDiceRolls = 5;
        Random random = new Random();

        System.out.println("Welcome to the Roll the Dice Game! You need to travel the entire game board with 20 spaces " +
                "in 5 dice rolls to win this game. Let's start!\n");

        do {

            int dice = random.nextInt(6) + 1;
            totalDiceRolls++;
            currentGameSpace += dice;

            int spacesLeft = totalBoardSpace - currentGameSpace;

            System.out.println("You rolled " + dice + "!\nYou rolled " + totalDiceRolls + " times.\n" +
                    "You have " + (maxDiceRolls - totalDiceRolls) + " rolls to go.\n");

            if (currentGameSpace < totalBoardSpace) {
                System.out.println("Your are currently on space " + currentGameSpace + " on the game board.");
                System.out.println("You have to go " + spacesLeft + " spaces more to win the game!\n");

            } else if (currentGameSpace == totalBoardSpace) {
                System.out.println("Congrats! You travelled the entire game board in 5 rolls and won the game.");
                break;

            } else {
                System.out.println("You lose! You are off the game board!");
                break;
            }


        } while (totalDiceRolls < maxDiceRolls);

        if (currentGameSpace != 20)
            System.out.println("You lose! You did not manage to travel to space 20 in 5 rolls.");

    }


}
