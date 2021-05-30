package package1;

import package2.C2;

public class B1 {
	public static void nonmain(String[] args) {
		//System.out.println("A1.privateMember: " + A1.privateMember);
		
		System.out.println("A1.defaultMember: " + A1.defaultMember);
		System.out.println("C1.defaultMember: " + C1.defaultMember);
		
		System.out.println("A1.protectedMember: " + A1.protectedMember);
		System.out.println("C1.protectedMember: " + C1.protectedMember);
		System.out.println("C2.protectedMember: " + C2.protectedMember);
		
		System.out.println("A1.publicMember: " + A1.publicMember);		
		System.out.println("C1.publicMember: " + C1.publicMember);
	}
}
