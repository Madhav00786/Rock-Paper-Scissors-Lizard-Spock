/*
* Name: Madhav Sachdeva 
* Student ID: 040918899
* Course & Section: CST8132 305
* Assignment: Lab 5
* Date: Oct 10, 2018
*/

package rps;

import java.util.Scanner;

/**
 * This abstract class extends Game class and the purpose of this class is to
 * assign number of rounds and players to the whole game
 * 
 * @author Madhav Sachdeva
 * @version 1.1
 * @since 1.8
 */
public class RockPaperScissors extends Game {

	/**
	 * Constructor to invoke super constructor of class Game
	 * 
	 * @param numRounds
	 *            Number of Rounds in the game
	 */
	public RockPaperScissors(int numRounds) {
		super(numRounds);
	}

	/**
	 * Method to assign name of players in the players array
	 */
	public void initPlayers() {// method from playable interface

		System.out.print("Enter the player's name: ");
		players[0] = new Human(in); // object of Human with reference of Player
		players[1] = new Computer();// object of Computer with reference of Player

	}

	/**
	 * Method to play turn of each player
	 */
	public void play() {

		for (int i = 0; i < numRounds; i++) {

			if (players[0].takeTurn() == false) {
				break;
			} else {
				players[1].takeTurn();
			}

			evaluateRound();// calling method

			// BONUS QUESTION
			if (i == numRounds - 1) {// condition so that the game must be at its last round
				System.out.println("Do you want to play 2 more rounds? Press y for YES OR n for NO ");
				Scanner in = new Scanner(System.in);

				String choice = in.next().toUpperCase();

				while (!choice.equals("Y") && !choice.equals("N")) {// condition to check invalid inputs

					System.out.println(
							"Invalid Input...Try Again. \nDo you want to play 2 more rounds? Press y for YES OR n for NO");
					choice = in.next().toUpperCase();

				}

				if (choice.equals("Y")) {// condition to increment number of rounds
					numRounds += 2;
				} else {

				}
			}
		}
	}

	/**
	 * Method to evauate results of the rounds
	 */
	public void evaluateRound() {

		HandSign[] moves = new HandSign[] { players[0].getLastMove(), players[1].getLastMove() };
		// Object of class HandSign to store moves of the players

		int winner = HandSign.getWinner(moves); // invoking getWinner method of HandSign class

		if (winner == -1) {// condition to check ties and wins
			Player.tie();

			System.out.println("It,s a tie! Ties:" + Player.getTies());
		}

		else {
			int loser = Math.abs(winner - 1);// taking absolute value

			System.out.println(moves[winner] + " beats " + moves[loser] + "!" + players[winner].getName() + " wins!");

			players[winner].win();
		}
	}

	/**
	 * Method to display the final results
	 */
	public void displayResults() {
		Player winner = null;
		for (int i = 0; i < NUM_PLAYERS; i++) {

			System.out.println(players[i].toString());

			if (players[i].getWins() > (numRounds - Player.getTies()) / 2) {
				winner = players[i];
			}

		}

		System.out.println("Ties: " + Player.getTies());

		if (winner == null) {// condition for wins or ties
			System.out.println("It’s a tie game!");
		}

		else {
			System.out.println("The winner is " + winner.getName() + "!");

		}

		System.out.println("Thanks for playing Rock, Paper, Scissors. Bye!");
	}

}
