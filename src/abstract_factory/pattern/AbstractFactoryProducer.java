package abstract_factory.pattern;

public class AbstractFactoryProducer {

		public static AbstractFactory  getProfession(boolean isTrainee) {
			if(isTrainee)
				return new TraineeProfessionalAbstractFactory();
			else 
				return new ProfessionAbstractFactory();
		}
}
