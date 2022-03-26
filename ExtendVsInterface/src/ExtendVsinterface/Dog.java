package ExtendVsinterface;

public class Dog implements IAnimal {

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 4.4;
	}

	@Override
	public String toString() {
		return "Dog [getAge()=" + getAge() + ", getColor()=" + getColor() + ", getWeight()=" + getWeight() + "]";
	}
	

}
