package methods;

public class Program {
	
	/*
	 * - A method has a method name and parameters
	 * - A method can and can not return a type of value based on what we want
	 * - A method signature consists of the methodName + Parameters.
	 * - In terms of invocation (method usage) the parameters are called arguments
	 * - A method must be primitive, array, class, interface or void.
	 */
	
	/*
	 * - Methods can be overloaded just like a constructur by taking in multiple amount of parameters
	 */
	
	public static void nonmain(String[] args) {
		System.out.println(Sum(2,3));
	}
	
	static double Sum(double x, double y) {
		return x + y;
	}
}
