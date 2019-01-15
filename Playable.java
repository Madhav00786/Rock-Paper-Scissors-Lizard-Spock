/*
* Name: Madhav Sachdeva 
* Student ID: 040918899
* Course & Section: CST8132 305
* Assignment: Lab 5
* Date: Oct 10, 2018
*/

package rps;

/**
 * This interface sets up an agreement for all the methods to be used in the
 * Game Class
 * 
 * @author Madhav Sachdeva
 * @version 1.1
 * @since 1.8
 */
public interface Playable {

	/**
	 * Number of players playing the game is always 2 as only a human and computer
	 * plays the game
	 */
	int NUM_PLAYERS = 2;// Answer== It has public access level modifier
						// It is a class property

	/** Abstarct method for the name of players in the whole game */
	void initPlayers();

	/** Abstract method for the working of the game */
	void play();

	/** Abstract method for evaluating the result of each round */
	void evaluateRound();

	/** Abstract method to display results */
	void displayResults();
	// Answer==These methods are by default public as part of an interface
	// and thus not need any specified access level modifier
	// these are abstract
}
