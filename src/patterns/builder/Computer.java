package patterns.builder;

public class Computer {
	
	private Os os;
	private String location;
	
	public Computer (Os os, String location) {
		this.os = os;
		this.location = location;
	}
	
	public void print() {
		System.out.println("Computer");
		System.out.println("Location: " + this.location);
		System.out.println("Os: " + this.os.name());
		System.out.println("Os - Office: " + this.os.office());
	}
	
}
