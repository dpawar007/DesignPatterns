package abstract_factory.pattern;

public class ProfessionAbstractFactory extends AbstractFactory {

	@Override
	Profession getProfession(String typeofProfession) {
		if(typeofProfession == null)
			return null;
		
		else if (typeofProfession.equals("Engineer"))  
		   return new Engineer();
		
		else if (typeofProfession.equals("Teacher"))
			return new Teacher();
				
		
		return null;
	}

}
