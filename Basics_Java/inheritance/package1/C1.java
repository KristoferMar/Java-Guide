package package1;

public class C1 extends A1{
	
	public static void nonmain(String[] args) {
		// Private member is not accessable
		// System.out.println("privateMember " + privateMemeber); 
		
		// Inherited members are directly accessable
		System.out.println("defaultMember: " + defaultMember);
		System.out.println("protectedMember " + protectedMember);
		System.out.println("publicMember: " + publicMember);
	}

}
