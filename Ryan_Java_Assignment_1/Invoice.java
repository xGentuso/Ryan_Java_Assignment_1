
public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;

	// Constructor
	public Invoice(String partNumber, String partDescription, int quanity, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quanity;
		this.pricePerItem = pricePerItem;
}
	// Getter methods
	public String getPartNumber() {
		return partNumber;
	}
	
	public String getPartDescription() {
		return partDescription;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}
	// Setter methods
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	
	public void setQuantity(int quanity) {
		if (quanity > 0) {
			this.quantity = quanity;
		} else {
			this.quantity = 0;
		}
	}
	
	public void setPricePerItem(double pricePerItem) {
		if (pricePerItem > 0.0) {
			this.pricePerItem = pricePerItem;
		} else {
			this.pricePerItem = 0.0;
		}
	}
	
	public double getInvoiceAmount() {
		return quantity * pricePerItem;
	} 
} 