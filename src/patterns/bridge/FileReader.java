package patterns.bridge;

public class FileReader implements FileManipulate {

	public void manipulate(String name) {
		System.out.println("read file: " + name);
	}

}
