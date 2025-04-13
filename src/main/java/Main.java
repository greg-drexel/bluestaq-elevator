/**
 * Bluestaq Code Challenge - Elevator Simulation
 * <p>
 * Assumptions: 1. Hard coded 1 freight, 1 guest, and 1 service elevator. If we
 * were to use this solution for multiple buildings that may have different
 * number of elevators, then I would use an XML or JSON configuration file to
 * define the elevators for each implementation.
 * </p>
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
 * challenge, I followed the basic principles from the book Clean Code by Robert
 * Marting.
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
