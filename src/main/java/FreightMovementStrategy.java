public class FreightMovementStrategy implements MovementStrategy {

	@Override
	public void moveToFloor(int currentFloor, int nextFloor) {
		System.out.println("Freight elevator moving slowly.");
	}
}
