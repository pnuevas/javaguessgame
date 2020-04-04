/**
 * 
 */

/**
 * @author melo GuessGame class contains 3 Player objects
 *
 *         and startGame method the method generates a random number that the
 *         three players guess
 * 
 *         the while loop contains a control bit that is always true while the
 *         game is being played by the three players when a player guessed the
 *         targetNumber correctly the state of the control bit changes to break
 *         the while loop
 */
public class GuessGame {
	// creates an instance objects of Player class
	Player p1 = new Player();
	Player p2 = new Player();
	Player p3 = new Player();

	boolean guessControlBit = true;

	void startGame() {

		int targetNumber = (int) (Math.random() * 10);

		while (guessControlBit) {
			System.out.println("target is " + targetNumber);

			if (p1.guess() != targetNumber) {
				// wrong guess
				System.out.println("p1 wrong guess " + p1.number);
			} else {
				// correct
				System.out.println("p1 right guess " + p1.number);
				guessControlBit = false;
			} // end of first if

			if (p2.guess() != targetNumber) {
				// wrong guess
				System.out.println("p2 wrong guess " + p2.number);
			} else {
				// correct
				System.out.println("p2 right guess " + p2.number);
				guessControlBit = false;
			} // end of second if

			if (p3.guess() != targetNumber) {
				// wrong guess
				System.out.println("p3 wrong guess " + p3.number);
			} else {
				// correct
				System.out.println("p3 right guess " + p3.number);
				guessControlBit = false;
			} // end of third if

		} // end of while

	}// end startGame()
}
