package AbstractVsInterface;

public class AbstractVsInterface {

	public static void main(String[] args) {
		
		
		Cat C1 = new Cat("Miley", 3, 4.5);
		System.out.println(C1.toString());
		Tiger T1 = new Tiger("Royal", 10, 200.21);
		System.out.println(T1.toString());
		
		Mammal M1 = new Mammal("Black");
		System.out.println(M1.toString());
	}

}
