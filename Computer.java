/*
* Name: Madhav Sachdeva 
* Student ID: 040918899
* Course & Section: CST8132 305
* Assignment: Lab 5
* Date: Oct 10, 2018
*/

package rps;

import java.util.Random;

/**
 * This class extends Player and the purpose of this class is working game of
 * computer as a player
 * 
 * @author Madhav Sachdeva
 * @version 1.1
 * @since 1.8
 */
public class Computer extends Player {// Computer inherits all non-private properties and
										// methods from Player

	/**
	 * Constructor to assign the name of computer and initiate number of wins
	 */
	public Computer() {
		super("HAL");
	}
	// Answer==No, Once you specify an explicit constructor,
	// you cannot use implicit default constructor.

	/**
	 * Method for taking each turn of a player and showing the last move
	 * 
	 * @return true if the turn is run successfully
	 */
	protected boolean takeTurn() {// method inherited from Player

		Random rnd = new Random();
		// Answer==This is a local variable
		// and it's scope is in only this method and
		// can only be accessed in this method
		// It does not require JavaDoc since it is local property and
		// can't be accessed outside

		lastMove = HandSign.values()[rnd.nextInt(3)];// assigning random result out of three moves
														// to the lastMove variable

		System.out.println(getName() + ", it's your turn!");
		System.out.println(getName() + " played " + getLastMove());
		return true;// turn completed successfully
	}

}
