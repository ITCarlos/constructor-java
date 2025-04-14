package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Product name: ");
		String productName = input.nextLine();
		System.out.print("Price: $");
		double price = input.nextDouble();
		
		Product product = new Product(productName, price);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.print("\nNumber of products to be added in stock: ");
		int quantity = input.nextInt();
		product.addQuantity(quantity);
		System.out.println("Product data: " + product);
		
		System.out.print("\nNumber of products to be removed from stock: ");
		quantity = input.nextInt();
		product.removeQuantity(quantity);
		System.out.println("Product data: " + product);
		
		input.close();
	}

}
