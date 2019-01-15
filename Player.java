/*
* Name: Madhav Sachdeva 
* Student ID: 040918899
* Course & Section: CST8132 305
* Assignment: Lab 5
* Date: Oct 10, 2018
*/

package rps;

/**
 * This abstract class Player contains the information about the player, his
 * wins, looses and ties.
 * 
 * @author Madhav Sachdeva
 * @version 1.1
 * @since 1.8
 */
public abstract class Player {// This class is abstract
								// since one method in it is still abstract

	/**
	 * Each player's Name
	 */
	protected final String NAME;

	/**
	 * Last move of each player in a game
	 */
	protected HandSign lastMove; // object of HandSign class

	/**
	 * Number of Wins
	 */
	protected int wins;

	/**
	 * Number of ties
	 */
	protected static int ties = 0;

	/**
	 * Constructor to initiate Name and Number of Wins
	 * 
	 * @param name Name of the player
	 */
	protected Player(String name) {
		NAME = name;
		wins = 0;
	}

	/**
	 * Getter method for lastMove
	 * 
	 * @return The last move of the player
	 */
	protected HandSign getLastMove() {
		return lastMove;
	}

	/**
	 * Getter method for wins
	 * 
	 * @return Number of wins
	 */
	protected int getWins() {
		return wins;
	}

	/**
	 * Getter method for ties
	 * 
	 * @return Number of ties
	 */
	protected static int getTies() {// Answer==The getter for ties should be static
		return ties;
	}

	/**
	 * Getter method for Name
	 * 
	 * @return Name of the Player
	 */
	protected String getName() {
		return NAME;
	}

	/**
	 * This method increments number of wins by 1
	 */
	protected void win() {
		wins += 1;
	}

	/**
	 * This method increments number of ties by 1
	 */
	protected static void tie() {// Answer== The method should be static
		ties += 1;
	}

	@Override
	/**
	 * It displays name and wins of the player
	 * 
	 * @return The name of Player with it's Number of Wins
	 */
	public String toString() {
		String wins = Integer.toString(this.wins);
		return ("Player: " + NAME + "\nWins: " + wins);
	}

	/**
	 * Abstract method to describe the turns if implemented further
	 * 
	 * @return boolean
	 */
	protected abstract boolean takeTurn();
}
