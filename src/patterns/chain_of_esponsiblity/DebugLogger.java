package patterns.chain_of_esponsiblity;

public class DebugLogger extends Logger {
	
	public DebugLogger(byte mask) {
		super(mask);
	}
	
	@Override
	protected void writeMessage(String message) {
		System.out.println(this.getClass().getSimpleName() + ": " + message);
	}

}
