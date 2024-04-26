
public class Date {
	private int month;
	private int day;
	private int year;

  // Constructor
	public Date(int month, int day, int year){
		this.month = month;
		this.day = day;
		this.year = year;
	}

	// Getter methods
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}

	// Setter methods
	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void displayDate() {
		System.out.printf("%02d/%02d/%d\n", month, day, year);
	}
}