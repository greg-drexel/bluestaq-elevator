import java.util.ArrayList;
import java.util.List;

abstract class Elevator {
	private MovementStrategy movementStrategy;
	private ElevatorContext context;
	private int currentFloor;
	private List<Integer> floorRequests;
	private int doorTimer;

	public Elevator(MovementStrategy movementStrategy, int doorTimer) {
		this.movementStrategy = movementStrategy;
		this.doorTimer = doorTimer;
		this.currentFloor = 1;
		this.floorRequests = new ArrayList<>();
		this.context = new ElevatorContext(this);
	}

	public void requestFloor(int floor) {
		context.requestFloor(floor);
	}

	public void moveToFloor() {
		context.moveToFloor();
	}

	public void openDoors() {
		context.openDoors();
	}

	public void closeDoors() {
		context.closeDoors();
	}

	public void enableAdminState() {
		context.enableAdminState();
	}

	public void disableAdminState() {
		context.disableAdminState();
	}

	protected MovementStrategy getMovementStrategy() {
		return movementStrategy;
	}

	protected void addFloorRequest(int floor) {
		if (!floorRequests.contains(floor) && currentFloor != floor) {
			floorRequests.add(floor);
		}
	}

	public List<Integer> getFloorRequests() {
		return floorRequests;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	protected void setCurrentFloor(int floor) {
		currentFloor = floor;
		updateDisplay(floor);
	}

	public int getDoorTimer() {
		return doorTimer;
	}

	public void ringBell() {
		System.out.println("Ding ding ding!");
	}

	public void callHelp() {
		System.out.println("Calling for help.");
	}

	public void emergencyStop() {
		System.out.println("Emergency stop!");
	}

	private void updateDisplay(int floor) {
		System.out.println("Floor: " + floor);
	}
}
