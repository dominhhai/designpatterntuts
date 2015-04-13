package patterns.builder;

public abstract class Os {
	
	protected String name;
	protected OfficeSoftware office;
	
	public Os() {
		this.tagName();
		this.installOffice();
	}
	
	String name() {
		return this.name;
	}
	
	String office() {
		return this.office.name();
	}
	
	protected abstract void tagName();
	
	protected abstract void installOffice();
}
