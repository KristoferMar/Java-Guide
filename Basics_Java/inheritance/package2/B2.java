package package2;

import package1.A1;

public class B2 {
	public static void nonmain(String[] args) {
		//System.out.println("A1.privateMember: " + A1.privateMember);
		//System.out.println("A1.defaultMember: " + A1.defaultMember);
		
		// Cant be accessed becuase it's not family member (in the same package)
		//System.out.println("A1.protectedMember: " + A1.protectedMember);
		//System.out.println("C2.protectedMember: " + C2.protectedMember);
		
		System.out.println("A1.publicMember: " + A1.publicMember);
		System.out.println("C2.publicMember: " + C2.publicMember);
	}
}
