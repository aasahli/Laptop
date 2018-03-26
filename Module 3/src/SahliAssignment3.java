import java.util.Scanner;

class Calculations {
	public double grossPay(double wage, int numberOfHours) {
		return wage * numberOfHours;
	}

	public double fedTaxWithholding(double totalPay, double federalTax) {
		return totalPay * federalTax;
	}

	public double stateTaxWithholding(double totalPay, double stateTaxRate) {
		return totalPay * stateTaxRate;
	}

	public double deductionTotal(double federalTax, double stateTaxRate) {
		return federalTax + stateTaxRate;
	}

	public double finalPay(double totalPay, double deduction) {
		return totalPay - deduction;
	}
	 
	
}

class TaxPayer {
	// attributes to be inputted by the user
	private String name;
	private int hoursWorked;
	private double pay;
	private double fedTax;
	private double stateTax;

	
	//constructor
	
	public TaxPayer() {
		
		this.setName();
		this.setHoursWorked();
		this.setPay();
		this.setFedTax();
		this.setStateTax();
		
	}
	
	// setters

	public void setName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee's Full Name: ");
		this.name = sc.nextLine();
	}

	public void setHoursWorked() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number weekly work hours: ");
		this.hoursWorked = sc.nextInt();
	}

	public void setPay() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hourly pay: ");
		this.pay = sc.nextDouble();
	}

	public void setFedTax() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Federal Tax rate as a decimal (20% is .2): ");
		this.fedTax = sc.nextDouble();

	}

	public void setStateTax() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the state tax rate as a decimal (9% is .09): ");
		this.stateTax = sc.nextDouble();
	}

	// getters
	public String getName() {
		return this.name;
	}

	public int getHoursWorked() {
		return this.hoursWorked;
	}

	public double getPay() {
		return this.pay;
	}

	public double getFedTax() {
		return this.fedTax;
	}

	public double getStateTax() {
		return this.stateTax;
	}
}

public class SahliAssignment3 {
	public static void main(String[] args) {

		Calculations calculator = new Calculations();
		TaxPayer myTaxPayer = new TaxPayer();
		/*myTaxPayer.setName();
		myTaxPayer.setHoursWorked();
		myTaxPayer.setPay();
		myTaxPayer.setFedTax();
		myTaxPayer.setStateTax();*/

		double grossPay = calculator.grossPay(myTaxPayer.getPay(), myTaxPayer.getHoursWorked());
		double fedTaxWithholding = calculator.fedTaxWithholding(grossPay, myTaxPayer.getFedTax());
		double stateTaxWithholding = calculator.stateTaxWithholding(grossPay, myTaxPayer.getStateTax());
		double totalDeduction = calculator.deductionTotal(fedTaxWithholding, stateTaxWithholding);
		double netPay = calculator.finalPay(grossPay, totalDeduction);

		String[] lineSplit = myTaxPayer.getName().split(",");
		String[] newName = lineSplit[0].split(" ");
		String newLine = newName[2] + "," + newName[0] + "," + newName[1];

		System.out.println("Employee Name: " + newLine);
		System.out.println("Number of Hours Worked Weekly: " + myTaxPayer.getHoursWorked());
		System.out.println("Hourly Pay Rate: " + myTaxPayer.getPay());
		System.out.println("Gross Pay: " + grossPay);
		System.out.println("Deductions: ");
		System.out.println("Federal Witholding (20%): " + fedTaxWithholding);
		System.out.println("State Withholding: " + (Math.round(stateTaxWithholding * 100.0) / 100.0));
		System.out.println("Total Deduction: " + (Math.round(totalDeduction * 100.0) / 100.0));
		System.out.println("Net Pay: " + Math.round(netPay * 100.0) / 100.0);

	}

}
