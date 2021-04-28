package oopIntro;

public class Product {
	
	// Constructor Bloðu
	public Product() {
		System.out.println("Ben çalýþtým");
	}
	
	// Overloading
	public Product(int id, String name, double unitPrice, String detail) {
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
}
