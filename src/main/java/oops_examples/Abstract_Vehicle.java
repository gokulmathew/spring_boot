package oops_examples;

//Abstract class
abstract class Abstract_Vehicle {
	// Abstract method (no implementation)
	public abstract void start();

	// Concrete method
	public void stop() {
		System.out.println("Vehicle stopped");
	}
}

//Concrete subclass
class Car extends Abstract_Vehicle {
	// Implementation of abstract method
	@Override
	public void start() {
		System.out.println("Car started");
	}
}