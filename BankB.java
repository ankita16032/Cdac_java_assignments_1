package assignments_1;

public class BankB extends Bank {

	private double deposit;

	public BankB(double deposit) {
		this.deposit = deposit;
	}

	@Override
	public double getBalance() {
		return deposit;
	}

}
