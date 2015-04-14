package patterns.facade;

public class SystemFacade {
	
	private static SystemFacade instance = new SystemFacade();
	
	public static SystemFacade getInstance() {
		return instance;
	}
	
	private CalculateSystem calSystem;
	private ControlSystem ctrSystem;
	
	private SystemFacade() {
		this.calSystem = new CalculateSystem();
		this.ctrSystem = new ControlSystem();
	}
	
	public void invokeCalculateSystem() {
		this.calSystem.doTask();
	}
	
	public void invokeControlSystem() {
		this.ctrSystem.doTask();
	}
	
}
