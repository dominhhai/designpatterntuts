package patterns.abstract_factory;

import patterns.abstract_factory.language.English;
import patterns.abstract_factory.language.Japanese;
import patterns.abstract_factory.language.Vietnamese;

public class LanguageFactory extends AbstractFactory {
	public static final byte ENGLISH = 0;
	public static final byte VIETNAMESE = ENGLISH + 1;
	public static final byte JAPANESE = VIETNAMESE + 1;

	public Object create(byte type) {
		switch (type) {
			case ENGLISH:
				return new English();
			case VIETNAMESE:
				return new Vietnamese();
			case JAPANESE:
				return new Japanese();
			default:
				return null;
		}
	}

}
