package ExtendVsinterface;

public class ExtendVsinterface {

	public static void main(String[] args) {
		Animal A1 = new Animal();
		
		Cat C1 = new Cat(4, "White");
		//Cat C1 = new Cat();
		//C1.setAge(3);
		//C1.setColor("Black");
		System.out.println(C1.toString());
		
		
		Dog D1 = new Dog();
		System.out.println(D1.toString());

	}

}
