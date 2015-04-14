package patterns.facade;

public class CalculateSystem implements ISystem {

	@Override
	public void doTask() {
		System.out.println("CalculateSystem is operating");
	}
}
