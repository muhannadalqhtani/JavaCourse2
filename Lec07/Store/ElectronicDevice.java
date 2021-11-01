package Store;

public class ElectronicDevice extends Product{

	public ElectronicDevice(int product_id, String name, double price, 
			boolean hasWarranty, int warranty_duration) {
		
		super(product_id, name, price);
		this.hasWarranty = hasWarranty;
		this.warranty_duration = warranty_duration;
	}
	
	boolean hasWarranty;
	int warranty_duration;
	
}
