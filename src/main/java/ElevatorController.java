import java.util.ArrayList;
import java.util.List;

public class ElevatorController {
	private static ElevatorController instance;
	private ElevatorContext context;
	private List<Elevator> elevators;

	public ElevatorController(ElevatorContext context) {
		this.context = context;
		elevators = new ArrayList<>();
		elevators.add(new FreightElevator());
		elevators.add(new GuestElevator());
		elevators.add(new ServiceElevator());
	}

	public static ElevatorController getInstance() {
		if (instance == null) {
			instance = new ElevatorController(new ElevatorContext());
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

	public void start() {
		System.out.println("Starting Elevator controller.");

		/* Simulation */
		requestFloor(0, 3);
		requestFloor(1, 5);
		requestFloor(1, 7);
		requestFloor(2, 8);
		moveElevators();
	}
}
