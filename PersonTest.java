/*
	 Implement Multilevel Inheritance with Method Overriding
	 Create a base class Person.Create a subclass Employee that extends Person, and includes the methods work() and
	 getSalary().Create another subclass HRManager that extends Employee, overrides the work() method, and adds a new 
	 method addEmployee() to simulate adding employees.
	 */

package assignments_1;

public class PersonTest {

	public static void main(String[] args) {

		Person person = new Person("Shweta", 24);
		person.displayInfo();
		person.work();

		System.out.println("====================");

		Employee employee = new Employee("Shweta", 24, 50000);
		employee.displayInfo();
		employee.work();
		System.out.println("Salary: " + employee.getSalary());

		System.out.println("====================");

		HrManager hrManager = new HrManager("Shweta", 24, 80000);
		hrManager.displayInfo();
		hrManager.work();
		hrManager.addEmployee();
		System.out.println("Salary: " + hrManager.getSalary());
	}
}
