package patterns.flyweight;

public class Person {
	
	private String id;
	private String name;
	private int count;
	
	public Person(String id) {
		this.id = id;
		this.name = "Awesome";
		this.count = 0;
	}
	
	public void print() {
		System.out.println("id: " + id + 
				" ->{ count: " + (++ this.count) + ", name: " + name + " }");
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
