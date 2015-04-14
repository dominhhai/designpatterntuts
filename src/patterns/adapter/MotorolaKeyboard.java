package patterns.adapter;

public class MotorolaKeyboard implements MobileKeyboard {
	
	public int getKeyCode(String key) {
		return -1000;
	}

}
