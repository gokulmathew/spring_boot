package oops_examples;

//Parent class
class Shape {
	// Method in the parent class
	public void draw() {
		System.out.println("Drawing a shape");
	}
}

//Child class 1
class Circle extends Shape {
	// Method overriding
	@Override
	public void draw() {
		System.out.println("Drawing a circle");
	}
}

//Child class 2
class Rectangle extends Shape {
	// Method overriding
	@Override
	public void draw() {
		System.out.println("Drawing a rectangle");
	}
}