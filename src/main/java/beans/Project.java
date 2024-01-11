package beans;
 
public class Project {
 
	Programmer programmer;

	 public Project() {}
	public Project(Programmer programmer) {
		super();
		this.programmer = programmer;
	}
 
 
	public Programmer getProgrammer() {
		return programmer;
	}
 
	public void setProgrammer(Programmer programmer) {
		this.programmer = programmer;
	}
 
	

}