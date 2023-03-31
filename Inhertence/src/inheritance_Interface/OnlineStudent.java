package inheritance_Interface;

public class OnlineStudent extends Student {

	
	public OnlineStudent(String name, int age, String program) {
		super(name,age);
		this.program = program;
	}
	
	
	public int getHomeworkScore() {
		return 90;
	}
	
	
	public void showInfo() { //overriding
		System.out.println("Student Name: "+ this.getName()+ " Student Age: "+ this.getAge()+ " Student program: "+this.program+ " HW: "+ this.getHomeworkScore());
	}
}
