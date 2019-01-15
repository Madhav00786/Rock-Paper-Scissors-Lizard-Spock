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
 * This abstract class implements Playable interface and the purpose of this
 * class is to assign number of rounds and players to the whole game
 * 
 * @author Madhav Sachdeva
 * @version 1.1
 * @since 1.8
 */
public abstract class Game implements Playable {
	// class abstract since some methods in super interface
	// are still not concrete

	/**
	 * Numberof Rounds
	 */
	protected int numRounds;

	/**
	 * Name of players
	 */
	protected Player[] players;// Array of Player as an object

	/**
	 * Declaration of Scanner object
	 */
	protected Scanner in;// Object of scanner

	/**
	 * constructor to initiate 'numRounds','players' and 'in'
	 * 
	 * @param numRounds
	 *            Number of Rounds
	 */
	protected Game(int numRounds) {

		this.numRounds = numRounds;
		players = new Player[NUM_PLAYERS];// parameter inherited from super interface

		in = new Scanner(System.in);// initializing Scanner

		this.initPlayers();// invoking method
		// Answer==Since Game class knows all the properties
		// and attributes of interface Playable
		// therefore it can call initPlayers method.
	}

	@Override
	/**
	 * The purpose of this method is to close Scanner class if it has not been
	 * closed yet.
	 */
	public void finalize() {
		// exception handling
		try {
			in.close(); // invoking close method of Scanner class
						// through object'in'
		} catch (Exception e) {

		}
	}

}
