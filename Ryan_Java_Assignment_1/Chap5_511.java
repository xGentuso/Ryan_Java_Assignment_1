
import java.util.Scanner;

public class Chap5_511 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of integers: ");
    int numOfIntegers = input.nextInt();

    if (numOfIntegers <= 0) {
      System.out.println("Please enter a positive number of integers: ");
      input.close();
      return;

    }

    System.out.print("Enter integer 1: ");
    int smallest = input.nextInt();

    for (int i = 2; i <= numOfIntegers; i++) {
      System.out.printf("Enter integer %d: ", i);
      int current = input.nextInt();

      if (current < smallest) {
        smallest = current;
      }
    }

    System.out.printf("The smallest value entered is: %d\n", smallest);

    input.close();

  }
}