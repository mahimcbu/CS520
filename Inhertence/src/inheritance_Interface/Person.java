package inheritance_Interface;

public class Person {
	private String name;
	private int age;
	static int height;
	
	
	static {
		height = 166;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//
	
	public Person(String name) {
		this.name= name;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age =age;
	}
	
	
	//
	
	
	public void showInfo() {
		System.out.println("Name: "+ this.getName()+ " Age: "+ this.getAge());
	}
	
	static void showStaticInfo() {
		
		System.out.println("this is a static method! and my height is: "+ height);
	}

}
