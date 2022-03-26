package AbstractVsInterface;

public abstract class Animal {
	private String color;
	public String getColor() {
		return this.color;
	}
	
	public Animal(String color) {
		this.color = color;
	}

	public abstract void speak();
}
