public class ServiceElevator extends Elevator {

	public ServiceElevator() {
		/* 3 second door timer */
		super(new ServiceMovementStrategy(), 3000);
	}
}
