import java.util.Date;

class GenericAccount extends Account {

	// attributes
	private String acctType = "Account";

	// constructor
	public GenericAccount(int id, double balance) {
		super(id, balance);
	}

	// setters

	// getters
	public String getAcctType() {
		return this.acctType;
	}

	// utility methods
	public void withdraw(double amount) {
		if (this.getBalance() - amount >= 0) {
			setBalance(this.getBalance() - amount);
			System.out.println("The new balance for your " + this.getAcctType() + " is " + this.getBalance());
		} else
			System.out.println("The overdraft withdraw limit of your " + this.getAcctType()
					+ " has been exceeded. Please choose a different withdrawl amount.");

	}

	public void deposit(double amount) {
		setBalance(this.getBalance() + amount);
		System.out.println("The new balance of " + this.getAcctType() + " is $" + getBalance());
	}

	public String toString() {
		return "This " + getAcctType() + " was created on " + this.getDateCreated() + ", has a balance of $"
				+ this.getBalance() + ", and has an interest rate of " + getAnnualInterestRate() + "%";
	}

}

class CheckingAcct extends Account {

	// attributes
	private String acctType = "Checking Account";
	private double odLimit = -500;

	// constructor
	public CheckingAcct(int id, double balance) {
		super(id, balance);
	}

	// setters
	public void setOdLimit(int limit) {
		this.odLimit = limit;
	}

	// getters
	public String getAcctType() {
		return this.acctType;
	}

	// utility methods
	public void withdraw(double amount) {
		if (this.getBalance() - amount >= odLimit) {
			setBalance(this.getBalance() - amount);
			System.out.println("The new balance for your " + this.getAcctType() + " is $" + this.getBalance());
		} else
			System.out.println("The overdraft withdraw limit of your " + this.getAcctType()
					+ " has been exceeded. Please choose a different withdrawl amount.");

	}

	public void deposit(double amount) {
		setBalance(this.getBalance() + amount);
		System.out.println("The new balance of " + this.getAcctType() + " is $" + getBalance());
	}

	public String toString() {
		return "This " + getAcctType() + " was created on " + this.getDateCreated() + ", has a balance of $"
				+ this.getBalance() + ", and has an interest rate of " + getAnnualInterestRate() + "%.";
	}

}

class SavingsAcct extends Account {
	// attributes
	private String acctType = "Savings Account";

	// constructor
	public SavingsAcct(int id, double balance) {
		super(id, balance);
	}
	// setters

	// getter
	public String getAcctType() {
		return this.acctType;
	}

	// utility methods
	public void withdraw(double amount) {
		if (this.getBalance() - amount >= 0) {
			setBalance(this.getBalance() - amount);
			System.out.println("The new balance for your " + this.getAcctType() + " is $" + this.getBalance());
		} else {
			System.out.println(
					"Savings accounts do not allow for overdraft. Please choose a different withdrawl amount.");
		}
	}

	public void deposit(double amount) {
		setBalance(this.getBalance() + amount);
		System.out.println("The new balance of " + this.getAcctType() + " is $" + getBalance());
	}

	public String toString() {
		return "This " + getAcctType() + " was created on " + this.getDateCreated() + ", has a balance of $"
				+ this.getBalance() + ", and has an interest rate of " + getAnnualInterestRate() + "%";
	}

}

public class sahliTask2 {
	public static void main(String[] args) {
		GenericAccount acct = new GenericAccount(1001, 25.00);
		GenericAccount.setAnnualInterestRate(4.5);
		CheckingAcct myCheckingAcct = new CheckingAcct(1111, 4500.00);
		CheckingAcct.setAnnualInterestRate(4.5);
		SavingsAcct mySavingsAcct = new SavingsAcct(1112, 10000.00);
		SavingsAcct.setAnnualInterestRate(4.5);

		System.out.println(acct);
		System.out.println(myCheckingAcct);
		System.out.println(mySavingsAcct);
		myCheckingAcct.withdraw(5600.00);
		myCheckingAcct.withdraw(300);
		mySavingsAcct.withdraw(5000.00);
		mySavingsAcct.withdraw(120000.00);
		mySavingsAcct.deposit(400.00);
		myCheckingAcct.deposit(120000);
		acct.deposit(400);
	}

}
