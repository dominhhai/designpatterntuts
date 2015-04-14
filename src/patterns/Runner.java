/**
 * A runner for all patterns
 */
package patterns;

import patterns.abstract_factory.AbstractFactory;
import patterns.abstract_factory.LanguageFactory;
import patterns.abstract_factory.OsFactory;
import patterns.abstract_factory.language.Language;
import patterns.abstract_factory.os.Os;
import patterns.builder.Computer;
import patterns.builder.ComputerBuilder;
import patterns.factory.Country;
import patterns.factory.CountryFactory;
import patterns.factory.Japan;
import patterns.factory.Vietnam;
import patterns.prototype.Awesome;
import patterns.singleton.Me;

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
		
		//
		// Abstract Factory
		//
		// OS
		AbstractFactory osFactory = AbstractFactory.getFactory(AbstractFactory.OS);
		// MacOS
		Os macos = (Os) osFactory.create(OsFactory.MAXOS);
		macos.print();
		// Linux
		Os linux = (Os) osFactory.create(OsFactory.LINUX);
		linux.print();
		// Windows
		Os windows = (Os) osFactory.create(OsFactory.WINDOWS);
		windows.print();
		
		// Language	
		AbstractFactory languageFactory = AbstractFactory.getFactory(AbstractFactory.LANGUAGE);
		// English
		Language english = (Language) languageFactory.create(LanguageFactory.ENGLISH);
		english.print();
		// Vietnamese
		Language vietnamese = (Language) languageFactory.create(LanguageFactory.VIETNAMESE);
		vietnamese.print();
		// Japanese
		Language japanese = (Language) languageFactory.create(LanguageFactory.JAPANESE);
		japanese.print();
		
		//
		// Singleton
		//
		for (int i = 0; i < 10; i ++) {
			Me me = Me.getInstance();
			me.call();
		}
		
		//
		// Builder
		//
		Computer computer = ComputerBuilder.createComputer(ComputerBuilder.LINUX, ComputerBuilder.HANOI);
		computer.print();
		
		computer = ComputerBuilder.createComputer(ComputerBuilder.WINDOWS, ComputerBuilder.TOKYO);
		computer.print();
		
		//
		// Prototype
		//
		
		Awesome awesome = new Awesome("Java Cloner");
		awesome.print();
		
		Awesome clone = (Awesome) awesome.clone();
		clone.print();
	}
}