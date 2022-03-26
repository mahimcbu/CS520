package AbstractVsInterface;

public class Tiger extends Cat implements IAnimal1{
	public String Predeator;

	public Tiger(String name, int age, double weight) {
		super(name, age, weight);
		this.Predeator = "I am dangerous!";
	
	}
	@Override
	public void eat() {
		System.out.println("I am the Tiger and I am eating!");
		
	}

	
	private int test() { //private
		return 40*7;
	}
	public int height() {
		return test();
	}
	@Override
	public String toString() {
		this.eat();
		return "Tiger [name=" + getName()+", height=" + height() + ",age="+ 
				+ getAge() + ",weight=" + getWeight() + " ,Predeator=" + Predeator +"]";
	}

	

}
