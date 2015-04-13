package patterns.abstract_factory;

public abstract class AbstractFactory {
	public static final byte OS = 0;
	public static final byte LANGUAGE = OS + 1;

	public static AbstractFactory getFactory(byte factory) {
		switch (factory) {
		case OS:
			return new OsFactory();
		case LANGUAGE:
			return new LanguageFactory();
		default:
			return null;
		}
	}

	public abstract Object create(byte type);
}
