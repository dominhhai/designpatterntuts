package patterns.bridge;

public class FileWritter implements FileManipulate {

	public void manipulate(String name) {
		System.out.println("write file: " + name);
	}
}
