/**
 * A runner for all patterns
 */
package patterns;

import java.util.ArrayList;
import java.util.function.Consumer;

import patterns.abstract_factory.AbstractFactory;
import patterns.abstract_factory.LanguageFactory;
import patterns.abstract_factory.OsFactory;
import patterns.abstract_factory.language.Language;
import patterns.abstract_factory.os.Os;
import patterns.adapter.MobileKeycodeAdapter;
import patterns.bridge.File;
import patterns.bridge.FileReader;
import patterns.bridge.FileWritter;
import patterns.builder.Computer;
import patterns.builder.ComputerBuilder;
import patterns.chain_of_esponsiblity.Logger;
import patterns.chain_of_esponsiblity.LoggerFactory;
import patterns.composite.EmployeeTester;
import patterns.decorator.Boy;
import patterns.decorator.ChildrenDecorator;
import patterns.decorator.Girl;
import patterns.facade.SystemFacade;
import patterns.factory.Country;
import patterns.factory.CountryFactory;
import patterns.factory.Japan;
import patterns.factory.Vietnam;
import patterns.filter.Filter;
import patterns.filter.Region;
import patterns.flyweight.Person;
import patterns.flyweight.PersonFactory;
import patterns.prototype.Awesome;
import patterns.proxy.Image;
import patterns.proxy.ImageProxy;
import patterns.singleton.Me;

/**
 * @author Hai Do Minh
 *
 */
public class Runner {

	public static void main(String[] args) {
		//
		// Factory
		//		
		// Vietnam
		Country vietnam = CountryFactory.getCountry(CountryFactory.VIETNAM);
		System.out.println("vietnam IS"+ (vietnam instanceof Vietnam ? " " : " NOT ") +"instance of Vietnam Class");
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
		
		//
		// Adapter
		//
		System.out.println("For Nokia: " + MobileKeycodeAdapter.getKeyCode("LEFT", MobileKeycodeAdapter.NOKIA));
		System.out.println("For Motorola: " + MobileKeycodeAdapter.getKeyCode("LEFT", MobileKeycodeAdapter.MOTOROLA));
		
		//
		// Bridge
		//
		File reader = new File("autorun.io", new FileReader());
		reader.fileMainpulate();
		File writter = new File("system.io", new FileWritter());
		writter.fileMainpulate();
		
		//
		// Filter
		//
		Region region = new Region();
		ArrayList<String> filtered = region.filter(new Filter() {
			
			@Override
			public boolean filter(String name) {
				return name.length() > 4;
			}
		});
		
		filtered.forEach(new Consumer<String>() {

			@Override
			public void accept(String arg0) {
				System.out.println(arg0);
			}
		});
		
		//
		// Composite
		//
		EmployeeTester.runner();
		
		//
		// Decorator
		//
		Boy boy = new Boy();
		boy.doTask();
		Girl girl = new Girl();
		girl.doTask();
		ChildrenDecorator moreBoy = new ChildrenDecorator(boy) {
			@Override
			public void doTask() {
				super.doTask();
				System.out.println("Boy does clearing house also");
			}
		};
		
		moreBoy.doTask();
		
		ChildrenDecorator moreGirl = new ChildrenDecorator(girl) {
			@Override
			public void doTask() {
				System.out.println("Girl does clearing house also");
				super.doTask();				
			}
		};
		
		moreGirl.doTask();
		
		//
		// Facade
		//
		SystemFacade.getInstance().invokeCalculateSystem();
		SystemFacade.getInstance().invokeControlSystem();
		
		//
		// Flyweight
		//
		String[] ids = {"x001", "x002", "x003"};
		for (int i = 0; i < 10; i ++) {
			String id = ids[(int)(Math.random() * ids.length)];
			Person person = PersonFactory.getPerson(id);
			person.print();
		}
		//
		// Proxy
		//
		Image image = new ImageProxy("the_image.png");
		image.display();
		System.out.println("re-print");
		image.display();
		
		//
		// Chain of Responsibility
		//
		Logger logger = LoggerFactory.getLogger();
		logger.log(Logger.DEBUG, "Debug");
		logger.log(Logger.INFO, "Info");
		logger.log(Logger.ERROR, "Error");
	}
}