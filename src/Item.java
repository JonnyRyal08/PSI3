//Item class for Restaurant

import java.text.NumberFormat;
/**
 * @author jrobertson08
 *
 */
public class Item {

	// private fields
	private String name;
	private String category;
	private double price;
	private String size;
	NumberFormat numForm = NumberFormat.getCurrencyInstance();

	// constructors
	/**
	 * @param name
	 * @param category
	 * @param price
	 */
	public Item(String name, String category, double price) {
		// overloaded constructor add name, category, price
		this.name = name;
		this.category = category;
		this.price = price;

	}

	/**
	 * @param name
	 * @param category
	 * @param price
	 * @param size
	 */
	public Item(String name, String category, double price, String size) {
		// overloaded constructor
		this.name = name;
		this.category = category;
		this.price = price;
		this.size = size;

	}

	// accessors and mutators
	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size
	 */
	public void setSize(String size) {
		this.size = size;
	}

	// toString
	public String toString() {
		if (size != null) {
			return "(" + size + ") " + name + "\t" + numForm.format(price);
		} else {
			return (name + "\t" + numForm.format(price));
		}
	}
}
