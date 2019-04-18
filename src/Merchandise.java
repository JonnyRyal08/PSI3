//Jonathan Robertson
public class Merchandise extends Item { //merchandise extends class Item and shows inheritance of fields created in Item
	//inheritance
	private String sex;
	
	public Merchandise(String name, String category, double price, String size, String sex) {
		//Merchandise has construcotr with parameters
		super(name, category, price, size); //super used 
		// TODO Auto-generated constructor stub
		this.sex = sex;//this 
		
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
