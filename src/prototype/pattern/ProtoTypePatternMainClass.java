package prototype.pattern;

public class ProtoTypePatternMainClass {

	public static void main(String[] args) {
 
			ProfessionCache.loadProffesionCache();
			
			Profession docProfession = ProfessionCache.getCloneNewPrefession(1);
			System.out.println(docProfession.hashCode());
			
			Profession engProfession = ProfessionCache.getCloneNewPrefession(2);
			System.out.println(engProfession.hashCode());
			
			Profession teacherProfession = ProfessionCache.getCloneNewPrefession(3);
			System.out.println(teacherProfession.hashCode());
			
			Profession docProfession1 = ProfessionCache.getCloneNewPrefession(1);
			System.out.println(docProfession1.hashCode());
			
	}

}
