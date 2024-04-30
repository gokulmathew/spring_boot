package oops_examples;



// Parent class
	class Animal {
		protected String name = "Shini";
		// Method in the parent class
		public void eat() {
			System.out.println("Animal is eating...");
		}
	}

// Child class inheriting from Animal
	class Dog extends Animal {
		// Method in the child class
		public void bark() {
			System.out.println("Dog is barking..." + "Printing protected member  "  + name);
		}
	}


