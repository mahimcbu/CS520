package inheritance_Interface;

public class Faculty extends Person implements AdjunctFaculty, FullTimeFaculty{
	private String title;
	public int id;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public Faculty(String name, int age, String title) {
		super(name,age);
		this.title = title;
		this.id = 100;
	}
	
	public String toString() {
		return "Faculty "+ getName()+": "+ getTitle()+ ",id: "+ this.id+ " otherId: "+ this.findId()+ " dept: "+ this.dept(); 
	}
	
	
	final public String dept() {
		return "sdka";
	}
	public int findId() {
		return 200;
	}
	public void Status() {
		System.out.println("Fulltime Faculty");
	}
	
	
	
}
