/*
* Name: Madhav Sachdeva 
* Student ID: 040918899
* Course & Section: CST8132 305
* Assignment: Lab 5
* Date: Oct 10, 2018
*/

package rps;

/**
 * This class contains the main method to generate the basic game
 * 
 * @author Madhav Sachdeva
 * @version 1.1
 * @since 1.8
 */
public class PlayGame {

	/**
	 * Static method where the output starts to take place
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playable childhood = new RockPaperScissors(3);
		childhood.play();
		childhood.displayResults();

	}

}
