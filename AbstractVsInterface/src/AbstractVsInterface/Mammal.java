package AbstractVsInterface;

public class Mammal extends Animal{
	private double weight;
	private String location;
	
	
	public Mammal(String color) {
		super(color);
		this.weight = 100;
		this.location = "Water";
	}

	

	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	@Override
	public void speak() {
		System.out.println("Poooooo!!");
		
	}



	@Override
	public String toString() {
		speak();
		return "Mammal [weight=" + weight + ", location=" + location + ", color=" + this.getColor()+", id="+this.getId()+ "]";
	}
	
	public final double getId() { //Cannot define it again elsewhere
		return 400;
	}
	protected double getNewid() {
		return 145.8;
	}
}
