package inheritance_Interface;

abstract public class Student extends Person{ //cannot create an object
	protected String program;

	
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	
	public Student(String name, int age) {
		super(name,age);
		this.program = "Null";
	}
	
	public Student(String name, int age, String program) {
		super(name,age);
		this.program = program;
	}
	abstract public int getHomeworkScore();
	abstract public void showInfo();
}
