import java.util.Scanner;

public class Chap2_224 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer 1: ");
        int num1 = input.nextInt();
        int smallest = num1;
        int largest = num1;

        for (int i = 2; i <= 5; i++) {
        	System.out.printf("Enter integer %d: ", i);
          int num = input.nextInt();

          if (num < smallest) {
                smallest = num;
          } else if (num > largest) {
                largest = num;
          }
        }

        System.out.printf("Smallest integer: %d%n", smallest);
        System.out.printf("Largest integer: %d%n", largest);

        input.close();
    } // main()
} // class
