package extraCode;
//Jonathan Robertson
//exercise in-class

public class Car {
	// fields
	private String model;
	private String make;
	private int year;

	// methods
	public void setModel(String M) { // setters should be void, they do not return
		model = M;
	}

	public void setMake(String F) {
		make = F;
	}

	public void setYear(int n) {
		year = n;
	}

	public String getModel() {
		return model;
	}

	public String getMake() {
		return make;
	}

	public int getYear() {
		return year;
	}

	public String getInfo() {
		return "Year: " + year + "\nMake: " + make + "\nModel: " + model;
	}

	// constructor creates object
	public Car(int year, String make, String model) { // header =overloaded constructor
		// called automatically when making new objects are created
		this.year = year;
		this.make = make;
		this.model = model;
	}

}