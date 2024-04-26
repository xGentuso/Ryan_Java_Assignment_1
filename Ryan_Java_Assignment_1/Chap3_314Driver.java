
import java.util.Scanner;

public class Chap3_314Driver {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the date (formatted: MM DD YYYY):");
		int month = input.nextInt();
		int day = input.nextInt();
		int year = input.nextInt();

		Date date = new Date(month, day, year);
		
		System.out.println("Date: ");
		date.displayDate();

		input.close();
	} // main()
} // class