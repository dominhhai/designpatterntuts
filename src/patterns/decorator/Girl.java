package patterns.decorator;

public class Girl implements Children {

	@Override
	public void doTask() {
		System.out.println("Girl does cooking");
	}
}
