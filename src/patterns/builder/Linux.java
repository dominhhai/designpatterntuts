package patterns.builder;

public class Linux extends Os {

	protected void tagName() {
		this.name = "Linux";
	}

	protected void installOffice() {
		this.office = new OpenOffice();
	}

}
