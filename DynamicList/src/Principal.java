
public class Principal {
	
	/**
	 * Procediment principal que il·lustra el funcionament de la classe "DynamicList".
	 */
	public static void main(String[] args) {
		// Declarem i instanciem una "DynamicList"
		DynamicList list = new DynamicList();		
		
		// Declarem i instanciem objectes "Student"
		Student student1 = new Student("is99999", "AA", null);
		Student student2 = new Student("is88888", "BB", null);
		Student student3 = new Student("is66666", "CC", null);
		Student student4 = new Student("is33333", "DD", null);
		Student student5 = new Student("is11111", "EE", null);
		
		// Fem que "student3" i "student5" siguin companys
		student3.setPartner(student5);
		student5.setPartner(student3);
		
		// Inserim els objectes "Student" a la "DynamicList"
		list.insert(student1);
		list.insert(student2);
		list.insert(student3);
		list.insert(student4);
		list.insert(student5);
		
		// Mostrem el "login" dels alumnes de la llista
		list.first();
		while(!list.end()) {
			System.out.println(list.get().getLogin());
			list.next();
		}
		
		System.out.println("--------------------------------------------");
		
		// Mostrem els alumnes que tenen company/"partner" i els eliminem de la llista
		list.first();
		while(!list.end()) {
			if(list.get().getPartner() != null) {
				Student partner = list.get().getPartner();
				System.out.println("student: "+list.get().getLogin() +" is partner of "+partner.getLogin()+" - (deleted)");
				list.delete();
			} else {
				list.next();
			}
		}
		
		System.out.println("--------------------------------------------");	
		
		// Mostrem els alumnes de la llista, ara queden els que no tenen company/"partner"
		list.first();
		while(!list.end()) {
			System.out.println(list.get().getLogin());
			list.next();
		}
	}

}