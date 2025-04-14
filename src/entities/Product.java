package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	/* A constructor is used to initialize the attributes
	 * Allow or force an object to receive data
	 */
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	/* An overloading allows for more than one version
	 * of the constructor, making it possible for the attribute
	 *  or object to be initialized or not
	 */
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void addQuantity(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeQuantity(int quantity) {
		this.quantity -= quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return  name + ", price: $" 
				+ String.format("%.2f", price) 
				+ ", quantity: " 
				+ quantity
				+ ", Total: $"
				+ String.format("%.2f", totalValueInStock());
	}
	
}
