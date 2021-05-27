package constructor;

public class Constructor {
	
	/*
	 * - A constructor is the base method which gets called when you instancate an instance of a class
	 * - An emtpy constructor is a constructor without parameters
	 * - You can have multiple constructors with different parameters
	 * - If you do not create a constructor for your class, the compiler will do it for you
	 * - A constructor can invocate another constructor meaning they can refer to values.
	 */
	
	public Constructor() {
		// This is an emtpy constructor for this class
	}
	
	public Constructor(String variable) {
		// This is another constructor with variables
	}
	
	public Constructor(String variable, boolean something) {
		// Constructor with two parameters invoking from above
		this(variable); // We are invoking variable from the cosntructor above
	}

}
