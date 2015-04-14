package patterns.facade;

public class ControlSystem implements ISystem {

	@Override
	public void doTask() {
		System.out.println("ControlSystem is operating");
	}
	
}
