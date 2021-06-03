package interfaces;

public class X extends AbstractA implements A {

	@Override
	public void foo() {
		System.out.println("AbstractA: foo");
		System.out.println("VAL: " + A.VAL);
	}
}
