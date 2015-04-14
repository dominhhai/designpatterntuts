package patterns.adapter;

public class NokiaKeyboard implements MobileKeyboard {

	public int getKeyCode(String key) {
		return 1000;
	}
}
