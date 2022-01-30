package singeton.pattern;

/*
  Durga IT
 */
class SingletonTest {
	
	private static SingletonTest t = null;

	private SingletonTest() {}

	synchronized public static SingletonTest getSingletonTest() {
		if (t == null) {
			t = new SingletonTest();
		}
		return t;

	}
}

public class SingletonCreatedClassTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
  		System.out.println(SingletonTest.getSingletonTest().hashCode());
		System.out.println(SingletonTest.getSingletonTest().hashCode());
		System.out.println(SingletonTest.getSingletonTest().hashCode());
	}
}
