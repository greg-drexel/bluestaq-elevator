public class AdminState implements ElevatorState {
	private int adminNextFloor = -1;

	@Override
	public void requestFloor(Elevator elevator, int floor) {
		adminNextFloor = floor;
		System.out.println("Admin state: Moving to floor " + floor + " without stopping.");
	}

	@Override
	public void moveToFloor(Elevator elevator) {
		if (adminNextFloor == -1) {
			System.out.println("Admin state: No admin next floor.");
			return;
		}

		if (adminNextFloor != elevator.getCurrentFloor()) {
			elevator.closeDoors();
			elevator.getMovementStrategy().moveToFloor(elevator.getCurrentFloor(), adminNextFloor);
			elevator.setCurrentFloor(adminNextFloor);
			elevator.openDoors();
		}
	}

	@Override
	public void openDoors(Elevator elevator) {
		System.out.println("Admin state: Opening doors. No timer. Doors stay open until closeDoors is called.");
	}

	@Override
	public void closeDoors(Elevator elevator) {
		System.out.println("Admin state: Closing doors.");
	}
}
