public class GuestElevator extends Elevator {

	public GuestElevator() {
		/* 5 second door timer */
		super(new GuestMovementStrategy(), 5000);
	}
}
