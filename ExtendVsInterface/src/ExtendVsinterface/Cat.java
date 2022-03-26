package ExtendVsinterface;

public class Cat extends Animal {

	public Cat(int age, String color) {
		super(age, color);
	}
	

	public Cat() {
		super();
		
	}


	@Override
	public String toString() {
		return "Cat age=" + getAge() + ", color=" + getColor();
	}
	
}
