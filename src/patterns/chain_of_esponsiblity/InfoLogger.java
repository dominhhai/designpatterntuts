package patterns.chain_of_esponsiblity;

public class InfoLogger extends Logger {
	
	public InfoLogger(byte mask) {
		super(mask);
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println(this.getClass().getSimpleName() + ": " + message);
	}

}
