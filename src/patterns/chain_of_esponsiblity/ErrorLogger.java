package patterns.chain_of_esponsiblity;

public class ErrorLogger extends Logger {

	public ErrorLogger(byte mask) {
		super(mask);
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println(this.getClass().getSimpleName() + ": " + message);
	}
}
