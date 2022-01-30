package factory.pattern;

import java.util.Scanner;

public class FactoryPatternMainClass {

	public static void main(String[] args) {
 
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Class Number Which you want to get Object 1.Doctor 2.Engineer 3.Teacher");
		String cl = obj.nextLine();
		String no="";
		switch(cl) {
		case "1": 
		      no="Doctor";
		      break;
		case "2": 
		      no="Engineer";
		      break;
		case "3": 
		      no="Teacher";
		      break;
		default:
			 System.out.println("Enter Correct Option");
		}
		ProfessionFactory professionFactory = new ProfessionFactory();
		
		Profession doc = professionFactory.getProfession(no);
		doc.print();
	}

}
