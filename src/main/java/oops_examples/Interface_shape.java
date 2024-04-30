package oops_examples;

//Interface
interface Interface_shape {
	// Method signatures (no implementation)
	double calculateArea();

	double calculatePerimeter();
}

//Concrete class implementing the interface
class Circle_class implements Interface_shape {
	private double radius;

	// Constructor
	public Circle_class(double radius) {
		this.radius = radius;
	}

	// Implementing methods from the interface
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}
}