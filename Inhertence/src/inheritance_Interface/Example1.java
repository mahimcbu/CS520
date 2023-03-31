package inheritance_Interface;

public class Example1 {

	public static void main(String[] args) {
		Person P1, P2;
		TraditionalStudent S1;
		OnlineStudent S2;
		Faculty F1;
		P1 = new Person("Alice", 24);
		P1.showInfo();
		P2 = new Person("Bob");
		//Person.showStaticInfo();
		P2.showStaticInfo();
		S1 = new TraditionalStudent("Miley", 18, "CS");
		S1.showInfo();
		S2 = new OnlineStudent("Rob", 20 , "Eng");
		S2.showInfo();
		
		
		F1 = new Faculty("Josh", 42, "Met");
		F1.Status();
		System.out.println(F1.toString());
				
	}

}
