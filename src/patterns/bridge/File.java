package patterns.bridge;

public class File {
	
	private String name;
	private FileManipulate fileManipulate;	
	
	public File(String name, FileManipulate fileManipulate) {
		this.name = name;
		this.fileManipulate = fileManipulate;
	}
	
	public void fileMainpulate() {
		this.fileManipulate.manipulate(this.name);
	}

}
