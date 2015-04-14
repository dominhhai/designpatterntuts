package patterns.decorator;

public class Boy implements Children {

	@Override
	public void doTask() {
		System.out.println("Boy does the garden");
	}
}
