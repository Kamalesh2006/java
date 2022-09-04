
public class Employee extends Person {
	private double annualSalary;
	private int year;
	private String insuranceNumber;
	public void setSalary(double annualSalary) {
		this.annualSalary=annualSalary;
	}
	public void getSalary() {
		System.out.println("Annual Salary: "+annualSalary);
	}
	public void setYear(int year) {
		this.year=year;
	}
	public void getYear() {
		System.out.println("The year employee started to work: "+ year);
	}
	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber= insuranceNumber;
	}
	public void getInsuranceNumber() {
		System.out.println("Insurance Number: " + insuranceNumber);
	}
}
