public class MovingState implements ElevatorState {

	@Override
	public void requestFloor(Elevator elevator, int floor) {
		elevator.addFloorRequest(floor);
		System.out.println("Floor " + floor + " requested.");
	}

	@Override
	public void moveToFloor(Elevator elevator) {
		if (elevator.getFloorRequests().isEmpty()) {
			System.out.println("No next floor. Returning to floor 1.");
			if (elevator.getCurrentFloor() == 1) {
				return;
			} else {
				elevator.setCurrentFloor(1);
			}
		}

		int nextFloor = elevator.getFloorRequests().remove(0);
		if (nextFloor != elevator.getCurrentFloor()) {
			elevator.closeDoors();
			elevator.getMovementStrategy().moveToFloor(elevator.getCurrentFloor(), nextFloor);
			elevator.setCurrentFloor(nextFloor);
			elevator.openDoors();
		}
	}

	@Override
	public void openDoors(Elevator elevator) {
		System.out.println("Door open disabled while moving.");
	}

	@Override
	public void closeDoors(Elevator elevator) {
		System.out.println("Door closed while moving.");
	}
}
