import java.util.ArrayList;
import java.util.List;

abstract class Elevator {
	private MovementStrategy movementStrategy;
	private ElevatorState currentState;
	private int currentFloor;
	private List<Integer> floorRequests;
	private int doorTimer;

	public Elevator(MovementStrategy movementStrategy, int doorTimer) {
		this.movementStrategy = movementStrategy;
		this.doorTimer = doorTimer;
		this.currentFloor = 1;
		this.floorRequests = new ArrayList<>();
		this.currentState = new IdleState();
	}

	public void requestFloor(int floor) {
		currentState.requestFloor(this, floor);
	}

	public void moveToFloor() {
		currentState.moveToFloor(this);
	}

	public void openDoors() {
		currentState.openDoors(this);
	}

	public void closeDoors() {
		currentState.closeDoors(this);
	}

	public void setState(ElevatorState state) {
		currentState = state;
	}

	public void enableAdminState() {
		setState(new AdminState());
	}

	public void disableAdminState() {
		setState(new IdleState());
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
