public class FreightElevator extends Elevator {

	public FreightElevator() {
		/* 7 second door timer */
		super(new FreightMovementStrategy(), 7000);
	}

}
