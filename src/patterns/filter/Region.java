package patterns.filter;

import java.util.ArrayList;

public class Region {
	
	private String[] name;

	public Region() {
		this.name = new String[] {"Vietnam", "Japan", "USA", "Cuba", "China"};
	}
	
	public ArrayList<String> filter(Filter filter) {
		ArrayList<String> filtered = new ArrayList<String>();
		
		for (String country: this.name) {
			if (filter.filter(country)) {
				filtered.add(country);
			}
		}
		
		return filtered;
	}
}
