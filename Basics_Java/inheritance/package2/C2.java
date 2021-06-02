package package2;

import package1.A1;

public class C2 extends A1 {
	public static void nonmain(String[] args) {
		System.out.println("protectedMember: " + protectedMember);
		System.out.println("publicMember: " + publicMember);
	}
}
