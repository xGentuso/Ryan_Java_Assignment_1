
public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	// Constructor
  public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		if (monthlySalary > 0) {
			this.monthlySalary = monthlySalary;
		} else {
			this.monthlySalary = 0.0;
		}
   }
	 
	 // Getter methods
	 public String getFirstName() {
		return firstName;
	 }
	 
	 public String getLastName() {
		return lastName;
	 }
	 
	 public double getMonthlySalary() {
		return monthlySalary;
	 }
	 // Setter methods
	 public void setFirstName(String firstName) {
		this.firstName = firstName;
	 }
	 
	 public void setLastName(String lastName) {
		this.lastName = lastName;
	 }
	 
	 public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary > 0) {
			this.monthlySalary = monthlySalary;
		} else {
			this.monthlySalary = 0.0;
		}
	 }
	 
	 public double calculateAnnualSalary() {
		return monthlySalary * 12;
	 }
	 
	 public void giveRaise(double percentage) {
		double raise = monthlySalary * percentage /  100;
		monthlySalary += raise;
	 }
}