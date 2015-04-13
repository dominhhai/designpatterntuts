package patterns.singleton;

public class Me {
	
	private static Me instance;
	
	private int count;
	
	public static Me getInstance() {
		if (instance == null) {			
			instance = new Me();
			System.out.println("Created single instance of Me");
		}
		return instance;
	}
	
	private Me () {
		count = 0;
	}
	
	public void call() {
		System.out.println("Call Me: " + (++ count));
	}
		
}
