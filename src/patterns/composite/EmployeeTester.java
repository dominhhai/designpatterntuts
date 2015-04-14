package patterns.composite;

/**
 * this is not a part of pattern, just is used to abstract the runner.
 * 
 * @author Hai Do Minh
 * 
 */

public class EmployeeTester {

	public static void runner() {
		Employee CEO = new Employee("John", "CEO", 30000);
		
		Employee headSales = new Employee("Robert", "Head Sales", 20000);
		Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);
		
		// group into CEO' tree
		CEO.add(headSales);
		CEO.add(headMarketing);
				
		Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);
		
		// group into headSales' tree
		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);
		
		Employee clerk1 = new Employee("Laura", "Marketing", 10000);
		Employee clerk2 = new Employee("Bob", "Marketing", 10000);
		
		// group into headMarketing' tree
		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
		
		// print out all employees as tree path
		System.out.println("・" + CEO);
		
		for (Employee headEmployee : CEO.getSuEmployees()) {
			System.out.println("-- " + headEmployee);
			
			for (Employee employee : headEmployee.getSuEmployees()) {
				System.out.println("---- " + employee);
			}
		}
	}

}
