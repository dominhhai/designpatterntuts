package patterns.proxy;

public class ImageProxy implements Image {

	private RealImage realImage;
	private String name;
	
	public ImageProxy(String name) {
		this.name = name;
	}
	
	@Override
	public void display() {
		if (realImage == null) {
			realImage = new RealImage(name);
		}
		
		realImage.display();
	}
	
}
