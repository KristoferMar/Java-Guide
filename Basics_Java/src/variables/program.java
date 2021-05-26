package variables;

public class program {
	
	public static void main(String[] args) {
		
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
		
	}

}
