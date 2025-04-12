public class ServiceMovementStrategy implements MovementStrategy {

	@Override
	public void moveToFloor(int currentFloor, int nextFloor) {
		System.out.println("Service elevator moving fast.");
	}
}
