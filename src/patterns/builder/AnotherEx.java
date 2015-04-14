package patterns.builder;

/**
 * http://stackoverflow.com/questions/222214/managing-constructors-with-many-parameters-in-java/222295#222295
 * 
 * @author Hai Do Minh
 *
 */
public class AnotherEx {
	private String name;
	private byte age = 14;
	private String motto = "";
	
	public AnotherEx() {
		
	}
	
//	@Deprecated
	public AnotherEx(String name, byte age, String motto) {
		this.name = name;
		this.age = age;
		this.motto = motto;
	}
	
//	@Deprecated
	public AnotherEx build() {
		return new AnotherEx(name, age, motto);
	}
	
	public AnotherEx name(String name) {
		this.name = name;
		return this;
	}
	
	public AnotherEx age(byte age) {
		this.age = age;
		return this;
	}
	
	public AnotherEx motto(String motto) {
		this.motto = motto;
		return this;
	}
}
