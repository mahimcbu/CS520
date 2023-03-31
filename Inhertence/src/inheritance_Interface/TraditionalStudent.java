package inheritance_Interface;

public class TraditionalStudent extends Student{
	
	public TraditionalStudent(String name, int age, String program) {
		super(name,age);
		this.program = program;
	}
	
	public void showInfo() { //overriding
		System.out.println("Student Name: "+ this.getName()+ " Student Age: "+ this.getAge()+ " Student program: "+this.program+ " HW: "+ this.getHomeworkScore());
	}
	
	public int getHomeworkScore() {
		return 100;
	}
}
