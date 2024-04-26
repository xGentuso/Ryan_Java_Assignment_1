
import java.util.Scanner;

public class Chap2_217 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    
      System.out.print("Enter the first integer: ");
      int num1 = input.nextInt();

      System.out.print("Enter the second integer: ");
      int num2 = input.nextInt();

      System.out.print("Enter the third integer: ");
      int num3 = input.nextInt();

      int sum = num1 + num2 + num3;

      int average = sum / 3;

      int product = num1 * num2 * num3;

      int smallest = Math.min(Math.min(num1, num2), num3);

      int largest = Math.max(Math.max(num1, num2), num3);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);

        input.close();
        } //main()
    } // class
