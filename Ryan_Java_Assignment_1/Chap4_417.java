import java.util.Scanner;

public class Chap4_417 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int totalMiles = 0;
    int totalGallons = 0;
    int tripCount = 0;

    System.out.println("Mileage Calculator");
    System.out.println("Enter the miles driven and gallons used for each trip:");

    while (true) {
      System.out.printf("Enter gallons used for trip %d: ", (tripCount + 1));
      int milesDriven = input.nextInt();

      if (milesDriven == -1) {
        break;
      }

      System.out.printf("Enter gallons used for trip %d: ", (tripCount + 1));
      int gallonsUsed = input.nextInt();

      double milesPerGallon = (double) milesDriven / gallonsUsed;
      System.out.printf("Miles per gallon for trip %d: %.2f%n", (tripCount + 1), milesPerGallon);

      totalMiles += milesDriven;
      totalGallons += gallonsUsed;

      double totalMilesPerGallon = (double) totalMiles / totalGallons;
      System.out.printf("Combined miles per gallon up to trip %d: %.2f%n", (tripCount + 1), totalMilesPerGallon);

      tripCount++;
    }

    System.out.println("Program has ended.");
    input.close();
  } // main()
} // class