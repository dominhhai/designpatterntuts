package patterns.abstract_factory;

import patterns.abstract_factory.os.Linux;
import patterns.abstract_factory.os.MacOS;
import patterns.abstract_factory.os.Windows;

public class OsFactory extends AbstractFactory {
	public static final byte MAXOS = 0;
	public static final byte LINUX = MAXOS + 1;
	public static final byte WINDOWS = LINUX + 1;

	public Object create(byte type) {
		switch (type) {
			case MAXOS:
				return new MacOS();
			case LINUX:
				return new Linux();
			case WINDOWS:
				return new Windows();
			default:
				return null;
		}
	}

}
