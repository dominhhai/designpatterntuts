package patterns.builder;

public class ComputerBuilder {
	
	public static final byte LINUX = 0;
	public static final byte WINDOWS = LINUX + 1;
	
	public static final String TOKYO = "東京";
	public static final String OSAKA = "大阪";
	public static final String HANOI = "Hà Nội";
	public static final String HOCHIMINH = "Hồ Chí Minh";
	public static final String NEWYORK = "New York";
	
	public static Computer createComputer (byte osType, String location) {
		Os os = null;
		switch (osType) {
			case LINUX:
				os = new Linux();
				break;
			case WINDOWS:
				os = new Windows();
				break;
			default:
				return null;
		}
		Computer computer = new Computer(os, location);
		return computer;
	}

}
