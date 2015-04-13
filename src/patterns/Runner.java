/**
 * A runner for all patterns
 */
package patterns;

import patterns.factory.Country;
import patterns.factory.CountryFactory;
import patterns.factory.Japan;
import patterns.factory.Vietnam;

/**
 * @author hai-4181
 *
 */
public class Runner {

	public static void main(String[] args) {
		//
		// Factory
		//		
		// Vietnam
		Country vietnam = CountryFactory.getCountry(CountryFactory.VIETNAM);
		System.out.println("vietname IS"+ (vietnam instanceof Vietnam ? " " : " NOT ") +"instance of Vietnam Class");
		vietnam.food();
		// Japan
		Country japan = CountryFactory.getCountry(CountryFactory.JAPAN);
		System.out.println("japan IS"+ (japan instanceof Japan ? " " : "NOT ") +"instance of Japan Class");
		japan.food();
	}

}
