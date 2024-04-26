import java.util.Scanner;

public class Chap3_312Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter invoice details:");
        
        System.out.print("Part Number: ");
        String partNumber = input.nextLine();
        
        System.out.print("Part Description: ");
        String partDescription = input.nextLine();
        
        System.out.print("Quantity: ");
        int quantity = input.nextInt();
        
        System.out.print("Price Per Item: ");
        double pricePerItem = input.nextDouble();

        Invoice invoice = new Invoice(partNumber, partDescription, quantity, pricePerItem);

        displayInvoice(invoice);

        input.close();
    }
    
    public static void displayInvoice(Invoice invoice) {
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: $" + invoice.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());
    } // main()
} // class