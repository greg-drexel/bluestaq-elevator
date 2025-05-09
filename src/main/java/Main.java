/**
 * Bluestaq Code Challenge - Elevator Simulation
 * <p>
 * Assumptions:
 * <ul>
 * <li>1) Hard coded 1 freight, 1 guest, and 1 service elevator. If we were to
 * use this solution for multiple buildings that may have different number of
 * elevators, then I would use a XML or JSON configuration file to define the
 * elevators for each implementation. Or implement an Admin GUI.</li>
 * <li>2) Floor requests only accept integers and do not account for basement or
 * "B" or penthouse "P" values.</li>
 * <li>3) Move to floor is only FIFO. For example, elevator won't stop on floor
 * 8 if moving to floor 10. Could be optimized.</li>
 * <li>4) There are no external up / down buttons for floors.</li>
 * <li>5) Console driven. Could add a GUI for simulation.</li>
 * <li>6) No junit test scripts.</li>
 * </ul>
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
 * Martin.
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
