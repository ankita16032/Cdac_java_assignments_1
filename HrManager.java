package assignments_1;

public class HrManager extends Employee{

	public HrManager(String name, int age, double salary) {
		super(name, age, salary);
	}

	@Override
	public void work() {
		System.out.println(name + " is an HR Manager Employee.");
	}

	public void addEmployee() {
		System.out.println(name + " is adding a new employee.");
	}

}
