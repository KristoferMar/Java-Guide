package inheritence;

public class TestClient {
	
	public static int getVal() {
		return 42;
	}
	
	public static void nonmain(String[] args) {
		A a = new X();
		a.foo();
		a.bar();
	}

}
