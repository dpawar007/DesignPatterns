package abstract_factory.pattern;

public class FactoryPatternMainClass {

	public static void main(String[] args) {
		//First get Factory instance from factory of factory class, if u want trainee
		
		AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);
		
		Profession engg = abstractFactory.getProfession("Engineer");
		
		engg.print();
	}

}
