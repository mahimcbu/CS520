package AbstractVsInterface;

public class Cat implements IAnimal, IAnimal1{
	private String name;
	private int age;
	private double weight;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return this.weight;
	}

	public Cat(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	@Override
	public String toString() {
		this.eat();
		return "Cat [name=" + this.name + ", age=" + this.age + ", weight=" + this.weight + " height="+this.height()+"]";
	}

	@Override
	public void eat() {
		System.out.println("I am eating!");
		
	}

	@Override
	public int height() {
		int x = 20*7;
		return x;
	}
	
	
	

}
