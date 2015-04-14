package patterns.prototype;

public class Awesome implements Cloneable {
	
	private String name;

	public Awesome() {
		name = "Awesome";
	}
	
	public Awesome(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Object clone() {
		Object clone = null;
		
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
	
	public void print() {
		System.out.println("Awesome: " + this.name);
	}

}
