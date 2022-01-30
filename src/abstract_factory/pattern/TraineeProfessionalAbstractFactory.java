package abstract_factory.pattern;

public class TraineeProfessionalAbstractFactory extends AbstractFactory {

	@Override
	Profession getProfession(String typeofProfession) {
		if(typeofProfession == null)
			return null;
		
		else if (typeofProfession.equals("Engineer"))  
		   return new TraineeEngineer();
		
		else if (typeofProfession.equals("Teacher"))
			return new TraineeTeacher();
				
 		return null;
	}

}
