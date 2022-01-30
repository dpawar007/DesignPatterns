package singeton.pattern;

public class SingletonClass {

	private static SingletonClass  singletonInstance = new SingletonClass();
	
	private SingletonClass() {}
	
	//Get the only Object available
	
	public static SingletonClass getInstance() {
		return singletonInstance;
	}
	
	public void simpleMethod() {
		System.out.println("hashCode of Singleton Object : "+singletonInstance.hashCode());
	}
}
