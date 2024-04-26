
import java.util.Scanner;

public class Chap5_517 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] productPrices = {2.98, 4.50, 9.98, 4.49, 6.87};
    double[] totalSales = new double[5];
    int productCount = 0;

    System.out.println("Enter product number and quantity sold: ");

    while (productCount < 5) {
      System.out.print("Product number (1-5): ");
      int productNumber = input.nextInt();

      if (productNumber == -1) {
        break;
      }

      if (productNumber < 1 || productNumber > 5) {
        System.out.println("Invalid product number. Please enter a number between 1 and 5.");
        continue;
      }

      System.out.print("Quantity sold: ");
      int quantitySold = input.nextInt();

      totalSales[productNumber - 1] += quantitySold * productPrices[productNumber - 1];
      productCount++;

    }
      System.out.println("Total sales for each product:");
      for (int i = 0; i < 5; i++) {
      System.out.printf("Product %d: $%.2f%n", (i + 1), totalSales[i]);
    }

    input.close();
  }
}