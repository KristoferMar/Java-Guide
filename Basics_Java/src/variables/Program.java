package variables;

public class Program {
	
	public static void nonmain(String[] args) {
		
		// Implicit casting
		int x1 = 65;
		long y1 = x1; // (Implicit casting by compiler)
		
		// Explicit casting
		long y = 42;
		int x = (int)y;
		
		byte b = 65;
		char c = (char) b; //c = 'A'
		char c1 = 65; // c= 'A'
		
		System.out.println(x);
		
		Array arrayTest = new Array();
		arrayTest.Arrays();
		
	}
}