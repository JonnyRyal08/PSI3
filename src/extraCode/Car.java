package extraCode;

//exercise in-class
/**
 * @author jrobertson08
 *
 */
public class Car {
	// fields
	private String model;
	private String make;
	private int year;

	// methods
	/**
	 * @param M
	 */
	public void setModel(String M) { // setters should be void, they do not return
		model = M;
	}

	/**
	 * @param F
	 */
	public void setMake(String F) {
		make = F;
	}

	/**
	 * @param n
	 */
	public void setYear(int n) {
		year = n;
	}

	/**
	 * @return
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @return
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @return
	 */
	public String getInfo() {
		return "Year: " + year + "\nMake: " + make + "\nModel: " + model;
	}

	/**
	 * @param year
	 * @param make
	 * @param model
	 */
	// constructor creates object
	public Car(int year, String make, String model) { // header =overloaded constructor
		// called automatically when making new objects are created
		this.year = year;
		this.make = make;
		this.model = model;
	}
}