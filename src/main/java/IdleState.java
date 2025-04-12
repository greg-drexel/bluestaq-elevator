public class IdleState implements ElevatorState {

	@Override
	public void requestFloor(Elevator elevator, int floor) {
		elevator.addFloorRequest(floor);
		System.out.println("Floor " + floor + " requested.");
	}

	@Override
	public void moveToFloor(Elevator elevator) {
		elevator.setState(new MovingState());
		elevator.moveToFloor();
	}

	@Override
	public void openDoors(Elevator elevator) {
		System.out.println("Doors opening.");
		try {
			Thread.sleep(elevator.getDoorTimer());
		} catch (InterruptedException e) {
			System.out.println("InterruptedException");
		}
	}

	@Override
	public void closeDoors(Elevator elevator) {
		System.out.println("Doors closing.");
	}
}
