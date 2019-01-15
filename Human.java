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
 * This class extends Player and contains the game of a human as a player
 * 
 * @author Madhav Sachdeva
 * @version 1.1
 * @since 1.8
 */
public class Human extends Player {// Computer inherits all non-private properties and
									// methods from Player

	private Scanner in;// no javadoc needed as access modifier is private

	/**
	 * Constructor to call super constructor and initiate Scanner
	 * 
	 * @param in Object of Scanner
	 */
	public Human(Scanner in) {
		super(in.next());
		this.in = in;
		// Only one Scanner objects exist in the memory at this point
	}

	/**
	 * Method to implement method inherited from Player Class and processes the turn
	 * of each player with giving the choice to the player
	 * 
	 * @return true if the turn has run successfully
	 */
	protected boolean takeTurn() {
		// Answer==Human will itself remain as an abstract class

		boolean decision;// variable to control the loop
		String choice;

		do {
			System.out.println(getName() + ", it's your turn(Enter R for Rock,"
					+ " P for Paper, S for Scissors, L for Lizards, K for Spock or Q to quit):");

			choice = in.next().toUpperCase().substring(0);// taking the capitalized
															// first letter of the choice entered

			decision = true;

			switch (choice) {

			case "Q":
				return false;

			case "S":
			case "P":
			case "R":
			case "L":
			case "K":
				lastMove = HandSign.getHandSign(choice);
				// storing the last move according to the choice entered

				System.out.println(getName() + " played " + lastMove);
				return true;

			default:
				System.out.println("Invalid input, please try again...");
				decision = false;

			}

		} while (decision == false);

		return true;// true to indicate the move completed successfully

	}

}
