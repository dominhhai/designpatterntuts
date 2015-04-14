package patterns.proxy;

public class RealImage implements Image {

	private String name;
	
	public RealImage(String name) {
		this.name = name;
		this.loadImage();
	}
	
	@Override
	public void display() {
		System.out.println("Display: "  + this.name);
	}
		
	private void loadImage() {
		System.out.println("Load Image into Memory");
	}
	
}