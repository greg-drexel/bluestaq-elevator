public class ElevatorContext {
	private ElevatorState currentState;
	private Elevator elevator;

	public ElevatorContext(Elevator elevator) {
		this.elevator = elevator;
		this.currentState = new IdleState();
	}

	public void setState(ElevatorState state) {
		this.currentState = state;
		System.out.println("State changed to: " + this.currentState);
	}

	public void requestFloor(int floor) {
		currentState.requestFloor(elevator, floor);
	}

	public void moveToFloor() {
		currentState.moveToFloor(elevator);
	}

	public void openDoors() {
		currentState.openDoors(elevator);
	}

	public void closeDoors() {
		currentState.closeDoors(elevator);
	}

	public void enableAdminState() {
		setState(new AdminState());
	}

	public void disableAdminState() {
		setState(new IdleState());
	}
}
