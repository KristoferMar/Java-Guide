package abstract_classes;

abstract class AbstractSubclass extends AbstractSuperclass{
	
	@Override
	void test1() {
		System.out.println("test1");
	}
	
	abstract void test3();
}
