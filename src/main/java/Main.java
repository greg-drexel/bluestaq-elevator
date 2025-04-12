/**
 * Bluestaq Code Challenge - Elevator Simulation
 * <p>
 * Design patterns: Attempted to build a solution that showcased numerous design
 * patterns. In this challenge you will see examples of the Singleton, Strategy,
 * State, and Template design patterns. The MovementStrategy might not be the
 * best fit for the strategy design pattern, however I wanted to include it more
 * for the pattern and not so much the logic. Other design patterns that I am
 * familiar with that are not included in this challenge are Factory, Builder,
 * and Decorator. And also Wrapper, although not technically a design pattern.
 * </p>
 * <p>
 * Comments: Excluded most comments in favor of clean code. Have had projects
 * managers and professors that either love or hate comments. For this code
 * challenge, I followed the basic principles of the book Clean Code by Robert
 * Marting which states, "The proper use of comments is to compensate for our
 * failure to express yourself in code. Note that I used the word failure. I
 * meant it. Comments are always failures. We must have them because we cannot
 * always figure out how to express ourselves without them, but their use is not
 * a cause for celebration." (Clean Code, page 54)
 * </p>
 *
 * @author Greg Reckenwald
 * @version 1.0
 * @since April 10, 2025
 */

public class Main {

	public static void main(String[] args) {
		ElevatorController controller = ElevatorController.getInstance();
		controller.start();
	}
}
