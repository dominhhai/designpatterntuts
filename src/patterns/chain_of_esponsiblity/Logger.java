package patterns.chain_of_esponsiblity;

public abstract class Logger {

	public static final byte INFO = 0;
	public static final byte ERROR = INFO + 1;
	public static final byte DEBUG = ERROR + 1;
	
	private byte mask;
	
	// The next element in the chain of responsibility
	private Logger next;
	
	public Logger(byte mask ) {
		this.mask = mask;
	}
	
	public void setNext(Logger next) {
		this.next = next;
	}
	
	public void log(byte priority, String msg) {
		if (priority <= mask) {
			this.writeMessage(msg);
		}
		
		if (this.next != null) {
			this.next.log(priority, msg);
		}
	}
	
	abstract protected void writeMessage(String message);
	
}
