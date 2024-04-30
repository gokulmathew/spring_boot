package oops_examples;

public class four_pillars {

	private int no = 4534543;

	public void doSomething() {
		System.out.println("lol" + no);
	}

	public void encapsulationExample() {
		System.out.println("Encapsulation Example");

		// Create a new Person object
		Person person = new Person("Alice", 30);

		// Display details
		person.displayDetails();

		// Change name and age using setter methods
		person.setName("Bob");
		person.setAge(25);

		// Display updated details
		person.displayDetails();
	}

	public void inheritanceExample() {
		System.out.println("Inheritance Example");
		// Creating an instance of Dog
		Dog dog = new Dog();

		// Calling methods from both parent and child classes
		dog.eat(); // Method from parent class
		dog.bark(); // Method from child class

	}

	public void polymorphismExample() {
		System.out.println("Polymorphism Example");
		Shape circle = new Circle();
		Shape rectangle = new Rectangle();

		// Calling the overridden method
		circle.draw(); // Output: Drawing a circle
		rectangle.draw(); // Output: Drawing a rectangle

	}

	public void interfaceExample() {
		System.out.println("Interface Example");
	    // Creating an instance of Circle
		Circle_class circle = new Circle_class(5.0);

        // Calling interface methods
        System.out.println("Area of circle: " + circle.calculateArea()); 

	}
	

	public void abstractExample() {
		System.out.println("Abstract Example");
	     // Creating an instance of Car
        Car car = new Car();

        // Calling abstract and concrete methods
        car.start(); // Output: Car started
        car.stop(); // Output: Vehicle stopped
	}

}
