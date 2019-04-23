
/**
 * @author jrobertson08
 *
 */
public class Merchandise extends Item { 
	//merchandise extends class Item and shows inheritance of fields created in Item
	//inheritance is important because you can reuse the fields and methods of a parent class
	//without having write them yourself
	private String sex;
	
	/**
	 * @param name
	 * @param category
	 * @param price
	 * @param size
	 * @param sex
	 */
	public Merchandise(String name, String category, double price, String size, String sex) {
		//Merchandise has constructor with parameters
		super(name, category, price, size); //super used 
		// TODO Auto-generated constructor stub
		this.sex = sex;//this 
		
	}
	/**
	 * @return
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
}
