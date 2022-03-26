package AbstractVsInterface;

public class Whale extends Mammal {

	public Whale(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	
	//Cannot define getid here because it's final
	protected double getNewid() { //But can declare this protected method
		return 145.4;
	}
	
	
}
