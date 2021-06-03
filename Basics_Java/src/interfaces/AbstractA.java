package interfaces;

public abstract class AbstractA implements A, B {
	public void bar() {
		System.out.println("AbstractA: bar");
		System.out.println("VAL: " + B.VAL);
	}
}
