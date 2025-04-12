public class ElevatorContext {
	private ElevatorState currentState;

	public ElevatorContext() {
		this.currentState = new IdleState();
	}

	public void setState(ElevatorState state) {
		this.currentState = state;
	}

	public void enableAdminState() {
		setState(new AdminState());
	}

	public void disableAdminState() {
		setState(new IdleState());
	}

}
