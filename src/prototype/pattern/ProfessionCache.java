package prototype.pattern;

import java.util.Hashtable;

public class ProfessionCache {

	private static Hashtable<Integer, Profession> prefessionMap = new Hashtable<Integer, Profession>();
	
	public static Profession getCloneNewPrefession(int id) {
		Profession cacheProfessionInstance = prefessionMap.get(id);
		return (Profession) cacheProfessionInstance.cloningMethod();
	}
	
	public static void loadProffesionCache() {
		Doctor doc = new Doctor();
		doc.id = 1;
		prefessionMap.put(doc.id,doc);
		
		Engineer engineer = new Engineer();
		engineer.id = 2;
		prefessionMap.put(engineer.id,engineer);
		
		Teacher teacher = new Teacher();
		teacher.id = 3;
		prefessionMap.put(teacher.id,teacher);
		
	}
}
