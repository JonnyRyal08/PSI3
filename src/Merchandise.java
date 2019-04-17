
public class Merchandise extends Item {
	private String sex;
	
	
	public Merchandise(String name, String category, double price, String size, String sex) {
	
		super(name, category, price, size);
		// TODO Auto-generated constructor stub
		this.sex = sex;
		
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
