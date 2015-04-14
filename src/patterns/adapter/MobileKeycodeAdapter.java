package patterns.adapter;

public class MobileKeycodeAdapter {
	
	public final static byte NOKIA = 0;
	public final static byte MOTOROLA = NOKIA + 1;
	
	public static int getKeyCode(String key, byte mobile) {
		switch (mobile) {
			case NOKIA:
				return (new NokiaKeyboard()).getKeyCode(key);
			case MOTOROLA:
				return (new MotorolaKeyboard()).getKeyCode(key);
			default:
				return -1;
		}
	}
}
