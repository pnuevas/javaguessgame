/**
 * 
 */

/**
 * @author melo Player class a number instance variable
 *
 *         guess method that generates a random number 0 to 9
 */
public class Player {
	int number;

	int guess() {
		return number = (int) (Math.random() * 10);
	}

}
