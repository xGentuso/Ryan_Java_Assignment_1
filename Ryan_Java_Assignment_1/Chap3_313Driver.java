
import java.util.Scanner;

public class Chap3_313Driver {
  public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first name for Employee 1:");
		String first1 = input.nextLine();

		System.out.println("Enter last name for Employee 1:");
		String last1 = input.nextLine();

		System.out.println("Enter monthly salary for Employee 1:");
		double monthlySal1 = input.nextDouble();

		System.out.println("Enter first name for Employee 2:");
		input.nextLine();
		String first2 = input.nextLine();

		System.out.println("Enter last name for Employee 2:");
		String last2 = input.nextLine();

		System.out.println("Enter monthly salary for Employee 2:");
		double monthlySal2 = input.nextDouble();

		Employee employee1 = new Employee(first1, last1, monthlySal1);
		Employee employee2 = new Employee(first2, last2, monthlySal2);

		System.out.println("\nYearly Salary:");
		System.out.printf("%s %s: $%.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.calculateAnnualSalary());
		System.out.printf("%s %s: $%.2f%n", employee2.getFirstName(), employee2.getLastName(), employee2.calculateAnnualSalary());

		
		employee1.giveRaise(10);
		employee2.giveRaise(10);

		
		System.out.println("\nAfter 10% raise:");
		System.out.printf("%s %s: $%.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.calculateAnnualSalary());
		System.out.printf("%s %s: $%.2f%n", employee2.getFirstName(), employee2.getLastName(), employee2.calculateAnnualSalary());

		input.close();
    } // main()
} // class