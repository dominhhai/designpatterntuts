package patterns.flyweight;

import java.util.HashMap;

public class PersonFactory {
	
	// with Java 8, we can omit the <String, Person>
	private static HashMap<String, Person> flyweight = new HashMap<>();
	
	public static Person getPerson(String id) {
		Person person = flyweight.get(id);
		
		if (person == null) {
			person = new Person(id);
			flyweight.put(id, person);
		}
		
		return person;
	}

}
