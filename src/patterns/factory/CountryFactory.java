package patterns.factory;

public class CountryFactory {
	public static final byte VIETNAM = 0;
	public static final byte JAPAN = VIETNAM + 1;
	
	public static Country getCountry(byte country) {
		switch (country) {
			case VIETNAM:
				return new Vietnam();
			case JAPAN:
				return new Japan();
			default:
				return null;
		}
	}
}
