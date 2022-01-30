package factory.pattern;

public class ProfessionFactory {

	public Profession getProfession(String typeofProfession) {
		if(typeofProfession==null) {
			return null;
		}
		if(typeofProfession.equals("Doctor")) {
			return new Doctor();
		}else if(typeofProfession.equals("Engineer")) {
			return new Engineer();
		}else if(typeofProfession.equals("Teacher")) {
			return new Teacher();
		}
		
		return null;
	}
}
