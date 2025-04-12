public interface ElevatorState {
	void requestFloor(Elevator elevator, int floor);

	void moveToFloor(Elevator elevator);

	void openDoors(Elevator elevator);

	void closeDoors(Elevator elevator);
}
