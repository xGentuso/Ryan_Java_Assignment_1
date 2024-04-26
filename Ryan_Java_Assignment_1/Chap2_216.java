import java.util.Scanner;

public class Chap2_216 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        if (num1 == num2) {
            System.out.println("These numbers are equal !");
        } 
        else {
            int largerNumber = num1 > num2 ? num1 : num2;
            System.out.printf("%d is larger \n", largerNumber);

            input.close();
        }
    } // main()
} // class