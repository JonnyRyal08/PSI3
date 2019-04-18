//Jonathan Robertson
//Item class for Restaurant

import java.text.NumberFormat;

public class Item {
	
	//private fields
	private String name;
	private String category;
	private double price;
	private String size;
	NumberFormat numForm = NumberFormat.getCurrencyInstance();
	
	// constructors
	public Item(String name, String category, double price) {
		//overloaded constructor add name, category, price
		this.name = name;
		this.category = category;
		this.price = price;
		
	}

	public Item(String name, String category, double price, String size) {
		//overloaded constructor adding size
		this.name = name;
		this.category = category;
		this.price = price;
		this.size = size;
		
	}
	
	// assessors and mutators
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	

	// toString
	public String toString() {
		if (size!= null) {
			return "(" + size + ") " + name + "\t" + numForm.format(price);
		}else {
			return (name + "\t" + numForm.format(price)); 
		}
	}
}
