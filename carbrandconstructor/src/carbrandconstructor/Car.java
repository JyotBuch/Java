package carbrandconstructor;

public class Car {
	String brand;
	
	public Car() {
		this.brand="Ford";
	}
	
	public String getBrand() {
		return brand;
	}
	
	void run() {
		System.out.println("Car is running");
	}
	
}
