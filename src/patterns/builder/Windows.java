package patterns.builder;

public class Windows extends Os {

	protected void tagName() {
		this.name = "Windows";		
	}

	protected void installOffice() {
		this.office = new MicrosoftOffice();
	}

}
