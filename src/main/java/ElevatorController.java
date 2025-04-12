import java.util.ArrayList;
import java.util.List;

public class ElevatorController {
	private static ElevatorController instance;
	private List<Elevator> elevators;

	public ElevatorController() {
		elevators = new ArrayList<>();
		elevators.add(new FreightElevator());
		elevators.add(new GuestElevator());
		elevators.add(new ServiceElevator());
	}

	public static ElevatorController getInstance() {
		if (instance == null) {
			instance = new ElevatorController();
		}
		return instance;
	}

	public void requestFloor(int index, int floor) {
		if (index >= 0 && index < elevators.size()) {
			elevators.get(index).requestFloor(floor);
			System.out.println("Added floor " + floor + " to elevator " + index + ".");
		} else {
			System.out.println("Elevator " + index + " is out of bounds.");
		}
	}

	public void moveElevators() {
		for (Elevator elevator : elevators) {
			if (!elevator.getFloorRequests().isEmpty()) {
				System.out.println("Processing floor requests...");
				elevator.moveToFloor();
			}
		}
	}

	public void enableAdminState(int index) {
		if (index >= 0 && index < elevators.size()) {
			elevators.get(index).enableAdminState();
			System.out.println("Enabled admin state to elevator " + index + ".");
		} else {
			System.out.println("Elevator " + index + " is out of bounds.");
		}
	}

	public void disableAdminState(int index) {
		if (index >= 0 && index < elevators.size()) {
			elevators.get(index).disableAdminState();
			System.out.println("Disabled admin state to elevator " + index + ".");
		} else {
			System.out.println("Elevator " + index + " is out of bounds.");
		}
	}

	public void start() {
		System.out.println("Starting Elevator controller.");

		/* Simulation */
		requestFloor(0, 3);
		requestFloor(1, 5);
		requestFloor(1, 7);
		requestFloor(2, 8);
		moveElevators();

		/* Test Admin State */
		System.out.println("Testing admin state.");
		enableAdminState(1);
		requestFloor(1, 3);
		moveElevators();
		disableAdminState(1);
	}
}
